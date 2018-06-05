package br.com.aguiardafa.estudo.designsolid.encapsulamentoLeiDeDemeter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fatura {
	private String cliente;
	private double valor;
	private List<Pagamento> pagamentos;
	private boolean pago;

	public Fatura(String cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
		this.pagamentos = new ArrayList<Pagamento>();
		this.pago = false;
	}

	public String getCliente() {
		return cliente;
	}

	public double getValor() {
		return valor;
	}

	public List<Pagamento> getPagamentos() {
		// return pagamentos; -- permitindo ir contra a Lei de Demeter
		return Collections.unmodifiableList(pagamentos);
	}

	public boolean isPago() {
		return pago;
	}

	// código prejudicando o encapsulamento
	// para setar fatura como paga existe uma regra de negócio por trás
	// public void setPago(boolean pago) {
	// this.pago = pago;
	// }

	// somenta propria fatura adiciona pagamentos em sua lista
	// e a própria fatura conhece a regra a ser executada após essa adicao
	public void adicionaPagamento(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
		if (valorTotalDosPagamentos() >= this.valor) {
			this.pago = true;
		}
	}

	private double valorTotalDosPagamentos() {
		double total = 0;

		for (Pagamento p : pagamentos) {
			total += p.getValor();
		}
		return total;
	}

}