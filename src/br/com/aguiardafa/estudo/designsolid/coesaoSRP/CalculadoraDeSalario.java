package br.com.aguiardafa.estudo.designsolid.coesaoSRP;

public class CalculadoraDeSalario {
	public double calcula(Funcionario funcionario) {
		//return funcionario.getCargo().getRegra().Calcula(funcionario); 
		
		//posso esconder o calculo no funcion�rio e chamar atrav�s de um m�todo
		return funcionario.calculaSalario();
	}
}
