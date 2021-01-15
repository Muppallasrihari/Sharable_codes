import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Create a method which accepts an array of numbers and returns the numbers and their squares in Hashmap
 * @author sri hari muppalla
 *
 */
public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size=sc.nextInt();
		int [] inputArray=new int[size];
		System.out.println("Enter the array values:");
		for(int i=0;i<size;i++) {
			inputArray[i]=sc.nextInt();
		}
		getSquares(inputArray);
		

	}
	
	public static HashMap<Integer, Integer> getSquares(int [] arr){
		
		HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
		for(int num:arr) {
				map.put(num, num*num);			
		}
		System.out.println("------------Number and their squares-----------");
		for(Map.Entry value:map.entrySet()) {
			System.out.println("Number :"+value.getKey()+"  Square: "+value.getValue());
		}
		return null;
		
	}

}
