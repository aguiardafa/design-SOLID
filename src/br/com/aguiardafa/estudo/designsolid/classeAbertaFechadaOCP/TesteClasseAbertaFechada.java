package br.com.aguiardafa.estudo.designsolid.classeAbertaFechadaOCP;

public class TesteClasseAbertaFechada {
public static void main(String[] args) {
	TabelaDePreco tabela = new TabelaDePrecoPadrao();
    ServicoDeEntrega entrega = new Frete();
	CalculadoraDePrecos calculadora = new CalculadoraDePrecos(tabela, entrega);
	
	TabelaDePreco tabelaDiferenciada = new TabelaDePrecoDiferenciada();
    ServicoDeEntrega entrega2 = new Frete();
    //a classe assumi outro comportamento, por conta da mudança dos parametros
    //consegui mudar o comportamento da CalculadoraDePrecos sem mexer no código dela]
    // aberta para extensão e fechada para modificação
    // ou seja extendo seu comportamento sem mudar a classe
	CalculadoraDePrecos calculadora2 = new CalculadoraDePrecos(tabelaDiferenciada, entrega2);
}
}
