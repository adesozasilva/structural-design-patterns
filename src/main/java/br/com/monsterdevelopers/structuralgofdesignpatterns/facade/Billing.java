package br.com.monsterdevelopers.structuralgofdesignpatterns.facade;

public class Billing {

	private Type type;
	private Invoice fatura;

	public Billing(Type type, Invoice fatura) {
		this.type = type;
		this.fatura = fatura;
	}

	public void issue() {
		
	}
	
	public Type getBoleto() {
		return type;
	}
	
	public Invoice getFatura() {
		return fatura;
	}

}
