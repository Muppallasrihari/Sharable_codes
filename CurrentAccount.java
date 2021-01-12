package com.cg.domain;

public class CurrentAccount extends Account{
private double overdraftLimt=6000;


@Override
public void withdraw(double amount) {
	  if(amount>overdraftLimt) {
		  System.out.println("False");
	  }
	  else {
		  System.out.println("True");
	  }
	
	
}
}
