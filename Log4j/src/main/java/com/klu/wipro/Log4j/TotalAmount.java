package com.klu.wipro.Log4j;

abstract public class TotalAmount {

	 protected double rate;  
     abstract void getRate();  


	public double calculateBill(double sqrfoot) {
		return sqrfoot*rate;
	}  
}
