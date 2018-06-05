package br.com.aguiardafa.estudo.designsolid.herancaLSP;

public class ManipuladorDeSaldo {
	private double saldo; // não preciso mais de variavel protected pois minha composição nao tem filhos
	
	public ManipuladorDeSaldo() {
		this.saldo = 0;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void render(double taxa) {
		this.saldo *= taxa;
	}

	public void sacar(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
