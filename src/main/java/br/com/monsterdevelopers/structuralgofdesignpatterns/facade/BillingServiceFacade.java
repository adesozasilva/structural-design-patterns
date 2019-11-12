package br.com.monsterdevelopers.structuralgofdesignpatterns.facade;

public class BillingServiceFacade {
	
	protected BillingServiceFacade(){}
	
	public Customer buscaCliente(String documentNumber){
		Customer customer = new CustomerDao().findBy(documentNumber);
		return customer;
	}
	
	public Invoice generateInvoice(Customer cliente, double valor){
		Invoice invoice = new Invoice(cliente, valor);
		return invoice;
	}
	
	public Billing generateBilling(Invoice fatura){
		Billing billing = new Billing(Type.PAYMENT_SLIP, fatura);
		billing.issue();
		
		return billing;
	}
	
	public CustomerNotification sendNotificationToCustomer(Customer cliente, Billing cobranca){
		CustomerNotification contato = new CustomerNotification(cliente,cobranca);
		contato.send();
		
		return contato;
	}
}
