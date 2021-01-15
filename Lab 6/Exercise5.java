import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 *  Create a method which accepts an array of integer elements and return the second smallest element in the array
 * @author- Ananya Priyadarshini
 */
public class Exercise5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size=sc.nextInt();
		int [] inputArray=new int[size];
		System.out.println("Enter the array values:");
		for(int i=0;i<size;i++) {
			inputArray[i]=sc.nextInt();
		}
		System.out.println("Entered array elements are");
		for(int num:inputArray) {
			System.out.println(num);
		}
		System.out.println("Second smallest element is");
		System.out.println(getSecondSmallest(inputArray));

}
	public static int getSecondSmallest(int[] inputArray){ 
		List list=new ArrayList(); 
		for(int num:inputArray) {
			list.add(num);
		}
		
			Collections.sort(list);
		 return (int) list.get(1);
			
			  
			  
		}
		      
	}  
