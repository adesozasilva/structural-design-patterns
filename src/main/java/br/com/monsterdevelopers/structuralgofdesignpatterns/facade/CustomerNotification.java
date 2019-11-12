package br.com.monsterdevelopers.structuralgofdesignpatterns.facade;

public class CustomerNotification {

	private Customer customer;
	private Billing billing;
	private boolean notified = false;

	public CustomerNotification(Customer customer, Billing billing) {
		this.customer = customer;
		this.billing = billing;
	}

	public void send() {
		this.notified = true;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public Billing getBilling() {
		return billing;
	}
	
	public boolean isNotified() {
		return notified;
	}
	

}
