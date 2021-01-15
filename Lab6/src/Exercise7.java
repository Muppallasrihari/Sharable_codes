/**
 * Create a method which accepts an integer array, reverse the numbers in the array and returns 
   the resulting array in sorted order
  *@author sri hari muppalla 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size=sc.nextInt();
		int [] arr= new int[size];
		System.out.println("Enter the array elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Entered array elements are:");
		for(int num:arr) {
			System.out.print(num+" ");
		}
		System.out.println("\n");
		getSorted(arr);

	}
	public static int[] getSorted(int [] arr) {
		List<Integer> list=new ArrayList<>();
		for(int i:arr) {
			list.add(i);
		}
		Collections.reverse(list);
		System.out.println("Elements after reverse:");
		for(int num:list) {
			System.out.print(num+" ");
		}
		System.out.println("\n");
		Collections.sort(list);
		System.out.println("Elements after sorting");
		for(int num:list) {
			System.out.print(num+" ");
		}
		
		return arr;
		
	}

}
