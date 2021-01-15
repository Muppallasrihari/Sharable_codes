package com.cg.eis.pl;
import java.security.Provider.Service;
import java.util.Scanner;
import com.cg.eis.service.EmployeeServiceImpl;

public class EmployeeTest {

	public static void main(String[] args) {
		
		EmployeeServiceImpl s = new EmployeeServiceImpl();
		
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


