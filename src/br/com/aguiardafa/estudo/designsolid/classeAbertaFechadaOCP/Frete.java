package br.com.aguiardafa.estudo.designsolid.classeAbertaFechadaOCP;

public class Frete implements ServicoDeEntrega{
	@Override
	public double para(String cidade) {
        if("SAO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        }
        return 30;
    }
}
