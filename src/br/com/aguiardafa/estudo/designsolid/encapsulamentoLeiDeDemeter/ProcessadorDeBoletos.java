package br.com.aguiardafa.estudo.designsolid.encapsulamentoLeiDeDemeter;

import java.util.List;

public class ProcessadorDeBoletos {
	public void processa(List<Boleto> boletos, Fatura fatura) {

        //double total = 0; -- passa a serm desnecess�rio
        for(Boleto boleto : boletos) {
            Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);
            //furando a Lei de Demeter
            //fatura.getPagamentos().add(pagamento);
            
            //m�todo encapsulando adicao de pagamento
            fatura.adicionaPagamento(pagamento);

            //total += boleto.getValor(); -- passa a serm desnecess�rio
        }

        //c�digo mal encapsulado
        //ProcessadorDeBoletos muito intimo de Fatura
        //if(total >= fatura.getValor()) {
        //    fatura.setPago(true);
        //}
    }
}
