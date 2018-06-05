package br.com.aguiardafa.estudo.designsolid.acoplamentoDIP;

public class NotaFiscalDao implements AcaoAposGerarNota  {
	@Override
    public void executa(NotaFiscal nf)  {
        System.out.println("salva nf no banco");
    }
}