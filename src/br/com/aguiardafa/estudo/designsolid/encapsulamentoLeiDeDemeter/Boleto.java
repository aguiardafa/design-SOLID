package br.com.aguiardafa.estudo.designsolid.encapsulamentoLeiDeDemeter;

public class Boleto {
	private double valor;


    public Boleto(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
