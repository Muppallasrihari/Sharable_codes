package com.cg.domain;

public class SavingsAccount extends Account {
	double newBalance;
	final double minumumBalance=500;
	  public double getMinumumBalance() {
		return minumumBalance;
	}
	  
	@Override
	  public void withdraw(double amount) {
		newBalance=getBalance()-amount;
		  if(newBalance<minumumBalance) {
			  System.out.println("Insufficient balance in the account....");
		  }
		  else {
			  System.out.println("Withdrawl is allowed..");
		  }
	  }
	
}
