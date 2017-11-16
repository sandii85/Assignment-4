package com.assignment_4.superclasses;

/**
 * This application is to set name and age  
 * Created on 15 Nov , 2017
 * @version 1.0
 * @author Sandra Björklund
 * 
 */
public class Human {

	private String name ="";
	private int age=0;
	/**
	 * This is a contstructor that takes String name and integer age as parameters
	 * @param name Name to string 
	 * @param age Age to integer
	 */
	public Human(String name,int age) {
         this.name = name;
         this.age = age;
	}
	/**
	 * This returns the String name 
	 * @return Returns the name
	 */

	public String getName() {
		return name;
	}
/**
 * This sets the String name 
 * @param name The name to set
 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * This returns the integer of age 
	 * @return Returns the age
	 */

	public int getAge() {
		return age;
	}
	/**
	 * This sets the integer of age
	 * @param age Age to set
	 */

	public void setAge(int age) {
		this.age = age;
	}


}


	

