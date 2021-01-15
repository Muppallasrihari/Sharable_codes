import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Create a method that accepts a character array and count the number of times each character is present in the array.
 * @author sri hari muppalla
 *
 */
public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input string:");
		String input=sc.next();
		char[] characterArray=input.toCharArray();
		countChars(characterArray);
		
	}
	
	public static Map<Character, Integer> countChars(char[] chr){
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(char ch:chr) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		System.out.println("------------Count of characters-----------");
		for(Map.Entry value:map.entrySet()) {
			System.out.println(value.getKey()+" "+value.getValue());
		}
		return map;
		
	}

}
