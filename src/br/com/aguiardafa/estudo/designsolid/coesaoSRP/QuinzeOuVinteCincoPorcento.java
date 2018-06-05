package br.com.aguiardafa.estudo.designsolid.coesaoSRP;

public class QuinzeOuVinteCincoPorcento implements RegraDeCalculo{
	@Override
	public double Calcula(Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 2000.0) {
			return funcionario.getSalarioBase() * 0.75;
		} else {
			return funcionario.getSalarioBase() * 0.85;
		}
	}
}
