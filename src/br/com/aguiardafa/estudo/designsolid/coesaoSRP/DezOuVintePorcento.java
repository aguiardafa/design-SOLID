package br.com.aguiardafa.estudo.designsolid.coesaoSRP;

public class DezOuVintePorcento implements RegraDeCalculo{
	@Override
	public double Calcula(Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.8;
		} else {
			return funcionario.getSalarioBase() * 0.9;
		}
	}
}
