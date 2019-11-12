package br.com.monsterdevelopers.structuralgofdesignpatterns.facade;

public class CustomerDao {

	public Customer findBy(String cpf) {
		return new Customer("18422898020", "+5511997656471");
	}

}
