package br.com.aguiardafa.estudo.designsolid.coesaoSRP;

public class CalculadoraDeSalario {
	public double calcula(Funcionario funcionario) {
		//return funcionario.getCargo().getRegra().Calcula(funcionario); 
		
		//posso esconder o calculo no funcionário e chamar através de um método
		return funcionario.calculaSalario();
	}
}
