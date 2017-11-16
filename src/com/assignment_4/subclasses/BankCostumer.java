package com.assignment_4.subclasses;

import java.util.ArrayList; 

import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.superclasses.Human;
/**
 * This is to set a name and age for the owner of the bank account
 * Created on 15 Nov , 2017
 * @version 1.0
 * @author Sandra Björklund
 * 
 */

public class BankCostumer extends Human {
	
 ArrayList<BankAccount> costumerAccounts = new ArrayList<BankAccount>();
 /**
  * This takes name and age of the account owner and calls the constructor of the superclass Human
  * @param name Name to string
  * @param age Age to integer
  */
	public BankCostumer(String name, int age) {
		super(name, age);
	}
	/**
	 * This sets the costumerAccounts to the arrayList
	 * @param costumerAccounts The costumer accounts to set
	 */

	public void setCostumerAccounts(ArrayList<BankAccount> costumerAccounts) {
		this.costumerAccounts = costumerAccounts;
	}
	/**
	 * This returns the costumerAccounts to the arrayList
	 * @return Returns costumer accounts
	 */
	public ArrayList<BankAccount> getCostumerAccounts() {
		return costumerAccounts;
	}
	/**
	 * A method that adds a bankAccount given as a parameter to the Arraylist
	 * @param bankAccount Adds bankAccount
	 */
	public void addAccount(BankAccount bankAccount) {
		costumerAccounts.add(bankAccount);
	}
	/**
	 * A method to deposit an amount of money to a specific account
	 * @param accountNumber The current ID of accountNumber
	 * @param amount The current amount of money
	 */
	public void depositToAccount(String accountNumber, double amount) {
		for (int i = 0; i < costumerAccounts.size(); i++) {
			if (costumerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				costumerAccounts.get(i).depositMoney(amount);
			}
		}

	}
	/**
	 * A method to withdraw an amount of money from a specific account
	 * @param accountNumber The current ID of accountNumber
	 * @param amount The current amount of money
	 */
	public void withdrawMoneyFromAccount(String accountNumber, double amount) {
		for (int i = 0; i < costumerAccounts.size(); i++) {
			if (costumerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				costumerAccounts.get(i).withdrawMoney(amount);
			}
		}
	}
    /**
    * toString(): Prints the name and the age of a bankCustomer
    */
	public String toString() {
		return "Costumer: Name " + getName() + " Age " + getAge()
				+ "\n" + "CostumerAccount " + costumerAccounts.get(0)+ "\n"+ costumerAccounts.get(1)+ "\n"+ costumerAccounts.get(2)+ "\n"
				 + "]";
	}
	
	

}
	


	
	
	
	
	
	
	

	
