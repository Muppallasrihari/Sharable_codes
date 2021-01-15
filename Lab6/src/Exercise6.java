import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * Create a method which accepts the id and the age of people as a Map and decide if they are eligible for vote. 
 * A person is eligible for vote if his age is greater than 18. Add the IDs of all the eligible persons to list and 
 * return the list.
 * @author sri hari muppalla
 *
 */
public class Exercise6 {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		hashMap.put(1, 19);
		hashMap.put(2, 22);
		hashMap.put(3, 14);
		hashMap.put(4, 27);
		hashMap.put(5, 25);
		hashMap.put(6, 30);
		hashMap.put(7, 6);
	
		List<Integer> list = new ArrayList<>();
		
		list = votersList(hashMap);
		
		System.out.println("Eligible Voter IDs are:");
		for(int id : list)
		{
			System.out.println(id);
		}
	}

	 static List<Integer> votersList(Map<Integer, Integer> map)
	{
		List<Integer> list = new ArrayList<>();
		
		for(Map.Entry<Integer, Integer> m : map.entrySet() )
		{
			int age = m.getValue();
			if(age > 18)
			{
				list.add(m.getKey());
			}
		}
		return list;
	}

	}
	
	
