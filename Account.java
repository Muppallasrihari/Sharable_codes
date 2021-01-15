package com.cg.domain;

public class Account extends Person {
  private long accNum;
  private double balance;
  private Person accHolder;
  
Person person=new Person();
	
public long getAccNum() {
	return accNum;
}
public void setAccNum(long accNum) {
	this.accNum = accNum;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public Person getAccHolder() {
	return accHolder;
}
public void setAccHolder(Person accHolder) {
	this.accHolder = accHolder;
}

public void deposit(double amount) {
	balance+=amount;
}
public void withdraw(double amount) {
	double bal=balance-amount;
	if(bal>500) {
		System.out.println("Withdrawl is allowed");
		balance-=amount;
	}
	else {
		System.out.println("Insufficient Balance");
	}
}
 
}
