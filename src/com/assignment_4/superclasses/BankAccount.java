
package com.assignment_4.superclasses;

import java.util.UUID;

import com.assignment_4.interfaces.BankOperations;

/**
 * This app is for managing bank accounts 
 * Created on 15 Nov , 2017
 * @version 1.0
 * @author Sandra Björklund
 * 
 */
    public class BankAccount implements BankOperations {
	//variabler
	private String accountNumber="";
	private String accountType="";
	private double balance=0.0;
	
	//construktor utan inparameter... 
	public BankAccount(){
		//the body of the constructor{this.accountNumber= UU} ... allt inom måsvingarna är kroppen
		//UUID.randomUUID = ett random id som räknas ut
		this.accountNumber = UUID.randomUUID().toString().substring(0,6);
		this.balance= 0.0;
		this.accountType= ("BankAccount");
	}
	/**
	 * This returns the ID of the actual accountNumber
	 * @return Returns the ID of the accountNumber
	 */
	
	public String getAccountNumber() {
		return accountNumber;
	}
	/**
	 * Sets the ID of the account number  
	 * @param accountNumber The ID of the accountNumber has been set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * This returns the actual accountType
	 * @return Returns the accountType
	 */
	public String getAccountType() {
		return accountType;
	}
	/**
	 * Sets the accountType
	 * @param accountType The accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	/**
	 * This returns the current balance of the account
	 * @return Returns the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * Sets the balance of the account
	 * @param balance The balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	* toString(): Prints the account number, account type and the balance of the account
	*/
	//return...... "Bankaccount[accountNumber:"....   =string ...+ accountNumber.... = inläsning osv......
	public String toString() {
		return "BankAccount [accountNumber:" + accountNumber + ", accountType:" + accountType + ", balance:" + balance+"]";
	}

	//implementerade från bankOperations 
	/**
	 * Implementations from bankOperations for withdraw money
	 */
	public void withdrawMoney(double amount) {
		if (amount>=0) {
			setBalance(getBalance() -amount);
			}else {
				System.out.println("you cannot withdraw a negative amount of money from the account");
			}
	}
	//implementerad från bankOperations
    /**
     * Implementations from bankOperations for deposit money
     */
	public void depositMoney(double amount) {
		if(amount>=0) {
			setBalance(getBalance() + amount);
		}else {
			System.out.println("you cannot deposit a negative amount of money to the account");
		}
		
	}	

}
