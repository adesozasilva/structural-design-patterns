package br.com.monsterdevelopers.structuralgofdesignpatterns.decorator;

public class ICMS extends Tax {

	public ICMS(Tax anotherTax) {
		super(anotherTax);
	}

	public ICMS() {
		super();
	}

	public double calculate(Budget budget) {
		return budget.getValor() * 0.1 + calculateAnotherTax(budget); 
	}

}