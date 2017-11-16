package com.assignment_4.interfaces;
/**
 * 
 * Created on 15 Nov , 2017
 * @version 1.0
 * @author Sandra Björklund
 * 
 */

public interface BankOperations {
	
	/**
	 * method to withdraw money from account
	 * @param amount The value of withdraw money from the amount
	 */
	//båda tar emot inparameter (amount)
	public void withdrawMoney(double amount);
	/**
	 * Method to deposit money to account
	 * @param amount The deposit money value of the amount
	 */
	public void depositMoney(double amount);
	

}
