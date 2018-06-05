package br.com.aguiardafa.estudo.designsolid.acoplamentoDIP;

import java.util.List;

public class GeradorDeNotaFiscal {
	// agora eu só depende da interface AcaoAposGerarNota
	// que tende a ser estável por ter muita gente que depende dela
	// DIP (inversao de dependencia) - devo denpender que tem é muito dependido - trabalhar com abstrações
	private List<AcaoAposGerarNota> acoes;

	public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes) {
		this.acoes = acoes;
	}

	public NotaFiscal gera(Fatura fatura) {
		double valor = fatura.getValorMensal();
		NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

		for (AcaoAposGerarNota acao : acoes) {
			acao.executa(nf);
		}

		return nf;
	}

	private double impostoSimplesSobreO(double valor) {
		return valor * 0.06;
	}
}
