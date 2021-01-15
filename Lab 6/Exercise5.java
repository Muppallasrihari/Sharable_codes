import java.util.*;  
import java.util.Collections;

public class Exercise5{  
	public static void main(String args[]){  
	       Integer array[]={1,2,5,6,3,7};  
	        System.out.println("Second Smallest: "+getSecondSmallest(array,6));  
	     
	}
public static int getSecondSmallest(Integer[] array, int total){  
      List<Integer> list=Arrays.asList(array);  
      Collections.sort(list);  
     int element=list.get(1);  
     return element;  
}  

}