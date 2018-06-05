package br.com.aguiardafa.estudo.designsolid.herancaLSP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimentos {

	public static void main(String[] args) {
		// imprimi o rendimentos das contas rentáveis
		contasComunsDoBanco().forEach(conta -> {
			conta.render();
			System.out.printf("Saldo: %,.2f\n", conta.getSaldo());
		});

		// imprimi as milhas das contas não rentáveis
		contasEstudantesDoBanco().forEach(conta -> {
			System.out.printf("Saldo: %,.2f - Milhas: %d\n", conta.getSaldo(), conta.getMilhas());
		});

		// para imprimir algo que se aplica a todas as conta do banco
		// rentáveis ou não podemos usar o "contasDoBanco()"
		double saldoTotalDoBanco = contasDoBanco().stream().mapToDouble(Conta::getSaldo).sum();
		System.out.println("Saldo Total do Banco é: " + saldoTotalDoBanco);

	}

	private static List<ContaNaoRentavel> contasEstudantesDoBanco() {
		return Arrays.asList(new ContaEstudante(100), new ContaEstudante(), new ContaEstudante(50));
	}

	private static List<ContaRentavel> contasComunsDoBanco() {
		return Arrays.asList(new ContaComum(100), new ContaComum(), new ContaComum(50));
	}

	private static List<Conta> contasDoBanco() {
		List<Conta> contas = new ArrayList<Conta>();
		contas.addAll(contasComunsDoBanco());
		contas.addAll(contasEstudantesDoBanco());
		return contas;
	}
}