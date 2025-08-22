package com.nt.upi;

import java.util.Random;

public class UPIPayment 
{
	public String doUpiPayment(String id,float amount)
	{
		return "UPI payment for the amount : "+amount+" is done";
	}
	
	public double checkbalance(String id,float amount)
	{
		return new Random().nextInt(10988);
	}
}
