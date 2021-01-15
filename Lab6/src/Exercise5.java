import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Create a method which accepts an array of integer elements and return the
 * second smallest element in the array.
 * 
 * @author sri hari muppalla
 *
 */
public class Exercise5 {

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
			System.out.println(num);
		}
		System.out.println("The second smallest element is:");
		System.out.println(getSecondSmallest(arr));

	}

	public static int getSecondSmallest(int[] arr) {
		List inputList=new ArrayList();
		for(int num:arr) {
			inputList.add(num);
		}
		
		Collections.sort(inputList);
		return (int) inputList.get(1);

	}
}
