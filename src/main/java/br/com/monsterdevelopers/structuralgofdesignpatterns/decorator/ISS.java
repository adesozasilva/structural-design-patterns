package br.com.monsterdevelopers.structuralgofdesignpatterns.decorator;

public class ISS extends Tax {

	public ISS(Tax anotherTax) {
		super(anotherTax);
	}

	public ISS() {
		super();
	}

	public double calculate(Budget budget) {
		return budget.getValor() * 0.06 + calculateAnotherTax(budget);
	}

}
