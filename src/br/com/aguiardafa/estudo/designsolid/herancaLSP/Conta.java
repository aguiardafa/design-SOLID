package br.com.aguiardafa.estudo.designsolid.herancaLSP;

public interface Conta {
	void depositar(double valor);
	
	void sacar(double valor);
	
	double getSaldo();
}
