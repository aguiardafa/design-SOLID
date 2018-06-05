package br.com.aguiardafa.estudo.designsolid.classeAbertaFechadaOCP;

public class TabelaDePrecoDiferenciada implements TabelaDePreco {

	@Override
	public double descontoPara(double valor) {
		return valor * 0.1;
	}

}
