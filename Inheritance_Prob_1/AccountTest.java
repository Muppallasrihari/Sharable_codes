package com.cg.test;

import java.util.Random;

import com.cg.domain.Account;
import com.cg.domain.CurrentAccount;
import com.cg.domain.SavingsAccount;


public class AccountTest {

	public static void main(String[] args) {
		Random random = new Random();
		
		Account smithAccount=new Account();
		smithAccount.setName("Smith");
		smithAccount.setAccNum(random.nextLong());
		smithAccount.setBalance(2000);
		
		
		Account kathyAccount=new Account();
		smithAccount.setName("Kathy");
		kathyAccount.setAccNum(random.nextLong());
		kathyAccount.setBalance(3000);
		
		
		smithAccount.deposit(2000);
		kathyAccount.withdraw(2600);
		
		SavingsAccount savAcc=new SavingsAccount();
		savAcc.deposit(5000);
		savAcc.withdraw(4600);
		
		CurrentAccount curAcc=new CurrentAccount();
		curAcc.withdraw(7000);
		
		System.out.println("Balance in Smith's Account:"+smithAccount.getBalance()+" Account number:"+smithAccount.getAccNum());
		System.out.println("Balance in Kathy's Account:"+kathyAccount.getBalance()+ " Account number:"+kathyAccount.getAccNum());

	}

}
