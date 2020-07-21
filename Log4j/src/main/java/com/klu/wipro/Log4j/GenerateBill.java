package com.klu.wipro.Log4j;

public class GenerateBill {

	public double totalcost(String name,double Sqrfoot)
	{
		GetHouseType housetype = new GetHouseType();
		TotalAmount total = housetype.getPlan(name);  
		total.getRate();
		double d=total.calculateBill(Sqrfoot);
		return d;
	}
}
