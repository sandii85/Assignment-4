package com.assignment_4.subclasses;

import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;
/**
 * 
 * Created on 15 Nov , 2017
 * @version 1.0
 * @author Sandra Björklund
 * 
 */
public class PersonalAccount extends BankAccount {

	public PersonalAccount() {
		
		/*detta är inga attribut.. detta är metoder som hämtas från klassen BankAccoun. därför paranteser som inparametrar 
		och inga likamed tecken.... den läser in*/
		this.setAccountNumber( UUID.randomUUID().toString().substring(0,6));
		this.setBalance(0.0);
		this.setAccountType("PersonalAccount");
		
	}
}