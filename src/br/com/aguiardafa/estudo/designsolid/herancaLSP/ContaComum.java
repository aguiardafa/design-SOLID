package br.com.aguiardafa.estudo.designsolid.herancaLSP;

public class ContaComum implements ContaRentavel {
	// não mais necessário pois quem vai manipular o saldo agora será a composição
	// protected double saldo; // acabamos afroxando o encapsulamento,
	// pois temos que permitir as filhas mexer na variavel

	private ManipuladorDeSaldo manipulador;

	public ContaComum() {
		// this.saldo = 0;
		this.manipulador = new ManipuladorDeSaldo();
	}

	public ContaComum(double valor) {
		// this.saldo = 0;
		this.manipulador = new ManipuladorDeSaldo();
		this.manipulador.depositar(valor);
	}

	// public void saca(double valor) {
	// if(valor <= this.saldo) {
	// this.saldo -= valor;
	// }else {
	// throw new IllegalArgumentException();
	// }
	// }
	
	@Override
	public void sacar(double valor) {
		this.manipulador.sacar(valor);
		// se aparecer uma regra de negócio para conta comum
		// eu coloca aqui antes de repassar
		// this.manipulador.saca(valor - 10);
	}

	// public void deposita(double valor) {
	// this.saldo += valor;
	// }
	@Override
	public void depositar(double valor) {
		this.manipulador.depositar(valor);
	}

	// public double getSaldo() {
	// return saldo;
	// }
	@Override
	public double getSaldo() {
		return this.manipulador.getSaldo();
	}

	// public void rende() {
	// this.saldo *= 1.1;
	// }
	@Override
	public void render() {
		this.manipulador.render(1.1);
	}
}
