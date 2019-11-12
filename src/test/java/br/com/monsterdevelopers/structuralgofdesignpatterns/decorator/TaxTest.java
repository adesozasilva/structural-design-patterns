package br.com.monsterdevelopers.structuralgofdesignpatterns.decorator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaxTest {

	private Tax taxes;
	private Budget budget;
	private double taxesValues;

	@Test
	public void testCalcula() {
		givenTaxes();
		
		whenCalculateTaxes();
		
		thenReturnShouldBeValue();
	}
	
	private void givenTaxes() {
		taxes = new ISS(new ICMS());
		budget = new Budget(500.0);
	}
	
	private void whenCalculateTaxes() {
		taxesValues = taxes.calculate(budget);
	}
	
	private void thenReturnShouldBeValue() {
		assertEquals(taxesValues, 80, 0.10);
	}

	

}
