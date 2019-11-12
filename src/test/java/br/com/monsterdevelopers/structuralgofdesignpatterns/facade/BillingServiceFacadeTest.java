package br.com.monsterdevelopers.structuralgofdesignpatterns.facade;

import static org.junit.Assert.*;

import org.junit.Test;

public class BillingServiceFacadeTest {

	private BillingServiceFacade facade;
	private Billing billing;
	private Invoice invoice;
	private Customer customer;
	private String documentNumber;
	private CustomerNotification customerNotification;

	@Test
	public void testBillingService() {
		givenBillingService();
		
		whenGenerateBilling();
		
		thenReturnShouldBeValue();
	}
	
	private void givenBillingService() {
		facade = new BillingServiceFacade();
	}
	
	private void whenGenerateBilling() {
		documentNumber = "18422898020";
		customer = facade.buscaCliente(documentNumber);
		invoice = facade.generateInvoice(customer, 500);
		billing = facade.generateBilling(invoice);
		customerNotification = facade.sendNotificationToCustomer(customer, billing);
	}
	
	private void thenReturnShouldBeValue() {
		assertTrue(customerNotification.isNotified());
	}


}
