package br.com.monsterdevelopers.structuralgofdesignpatterns.facade;

public class Invoice {

	private double valor;
	private Customer cliente;

	public Invoice(Customer cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	public Customer getCliente() {
		return cliente;
	}

}
