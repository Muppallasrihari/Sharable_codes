package lab6;

import java.util.HashMap;
import java.util.Iterator;

public class Exercise3 {

	public static HashMap<Integer,Integer> getSquares(int array[])
	{
		HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
		
		for(int n:array)
		{
			map.put(n, n*n);
		}
		return map;
	}
	 
	public static void main(String[] args) {
 
		int array[]=new int[] {1,2,3,4,5,6};
		HashMap<Integer,Integer> map = getSquares(array);
		
		Iterator<Integer> i = map.keySet().iterator();
		while(i.hasNext()){
		    Integer key = i.next();
		      System.out.print(key + ":" + map.get(key) + " " );
		    }
	}

}
