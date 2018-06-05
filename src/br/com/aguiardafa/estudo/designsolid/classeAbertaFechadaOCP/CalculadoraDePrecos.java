package br.com.aguiardafa.estudo.designsolid.classeAbertaFechadaOCP;

public class CalculadoraDePrecos {
	private TabelaDePreco tabela;
	private ServicoDeEntrega servicoEntrega;

	public CalculadoraDePrecos(TabelaDePreco tabela, ServicoDeEntrega servicoEntrega) {
		this.tabela = tabela;
		this.servicoEntrega = servicoEntrega;
    }
	
	public double calcula(Compra produto) {

        double desconto = tabela.descontoPara(produto.getValor());
        double frete = servicoEntrega.para(produto.getCidade());

        return produto.getValor() * (1-desconto) + frete;
    }
}
