package com.nt.netbanking;

import java.util.Random;

public class NetBanking 
{
	public String openAccount(String aadhar,double initialamount,String type)
	{
		return "Account is Opened with Acc no : "+new Random().nextLong(1321342123423L);
	}
	
	public String withdraw(long accno,double amount)
	{
		return "Amount is Withdrawn from the Acc No : "+accno;
	}
	
	public String deposite(long accno,double amount)
	{
		return "Amount is Deposited in to  the Acc No :  "+accno;
	}
	
	public String closeAccount()
	{
		return "Account is closed";
	}
}
