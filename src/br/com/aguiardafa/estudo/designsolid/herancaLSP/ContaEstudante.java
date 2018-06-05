package br.com.aguiardafa.estudo.designsolid.herancaLSP;

//caso ainda queira usar o benef�cio do polimorfismo - implementar interfaces
public class ContaEstudante implements ContaNaoRentavel{ // extends ContaComum {

	private ManipuladorDeSaldo manipulador;
	private int milhas;

	public ContaEstudante() {
		this.manipulador = new ManipuladorDeSaldo();
	}
	
	public ContaEstudante(double valor) {
		// this.saldo = 0;
		this.manipulador = new ManipuladorDeSaldo();
		this.manipulador.depositar(valor);
	}
	
	@Override
	public void depositar(double valor) {
		this.manipulador.depositar(valor);
		// aqui a regra de neg�cio
		this.milhas += (int) valor;
	}
	
	@Override
	public int getMilhas() {
		return this.milhas;
	}
	
	@Override
	public double getSaldo() {
		return this.manipulador.getSaldo();
	}

	@Override
	public void sacar(double valor) {
		this.manipulador.sacar(valor);
		
	}

	// NAO PRECISA MAIS REESCRVER ESTE M�TODO
	// POIS AGORA A CLASSE NAO HERDA DE NINGU�M ALGO INDESEJ�VEL
	// @Override
	// public void rende() {
	// try {
	// throw new Exception(); //ContaNaoRendeException
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }

}
