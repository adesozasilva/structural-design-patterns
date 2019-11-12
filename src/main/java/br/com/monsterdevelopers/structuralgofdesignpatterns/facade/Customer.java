package br.com.monsterdevelopers.structuralgofdesignpatterns.facade;

public class Customer {

	private String documentNumber;
	private String contactPhone;

	public Customer(String documentNumber, String contactPhone) {
		this.documentNumber = documentNumber;
		this.contactPhone = contactPhone;
	}
	
	public String getDocumentNumber() {
		return documentNumber;
	}
	
	public String getContactPhone() {
		return contactPhone;
	}

}
