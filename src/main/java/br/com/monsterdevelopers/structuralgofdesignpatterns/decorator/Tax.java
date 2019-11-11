package br.com.monsterdevelopers.structuralgofdesignpatterns.decorator;

public abstract class Tax {

	private final Tax tax;
	
	public Tax(Tax anotherTax) {
		this.tax = anotherTax;
	}

	public Tax() {
		tax = null;
	}

	protected double calculateAnotherTax(Budget budget) {
		return (tax == null ? 0 : tax.calculate(budget));
	}

	public abstract double calculate(Budget budget);
}