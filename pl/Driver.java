package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.services.Service;

public class Driver
{
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Service s = new Service();
		
		Scanner sc = new Scanner(System.in);
		Scanner scs = new Scanner(System.in);
		System.out.print("Enter ID:");
		int id = sc.nextInt(); 
		
		System.out.print("Enter name:");
		String name = scs.nextLine();
		
		System.out.print("Enter salary:");
		double salary = sc.nextDouble();
		
		System.out.print("Enter designation:");
		String designation = scs.nextLine();
		
		s.userInput(id, name, salary, designation);
		s.showData();
		
		sc.close();
		scs.close();
	}

}
