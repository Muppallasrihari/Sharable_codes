/**
 * Exercise 4:  school offers medals to the students of tenth based on the following criteria 
If(Marks>=90) : Gold 
If(Marks between 80 and 90) : Silver 
If(Marks between 70 and 80) : Bronze 
Note: Marks between 80 and 90 means marks>=80 and marks<90 

Write a function which accepts the marks of students as a Hashmap and return the details of the students eligible for the medals along with type of medal. 
The input Hashmap contains the student registration number as key and mark as value. 
The output Hashmap should contain the student registration number as key and the medal type as value.
Method Name 	getStudents 
Method Description 	Generate the list of students eligible for scholarship 
Argument 	Hashmap 
Return Type 	Hashmap 
Logic 	The method should return the details of the students eligible for the medals along with the medal type. 

 * @author RISHITA CHOUBEY
 *
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Students {
	

	
	       public HashMap<String,String> getStudent(HashMap<String,Integer> stu)
	       {
	              HashMap<String,String> medal = new HashMap<>();
	              Set<String> set = stu.keySet();
	              for(String s:set)
	              {
	                     Integer marks = stu.get(s);
	                     if(marks>=90)
	                     {
	                           medal.put(s,"Gold");
	                     }
	                     else if(marks >=80)
	                     {
	                           medal.put(s,"Silver");
	                     }
	                     else if(marks>=70)
	                     {
	                           medal.put(s,"Bronze");
	                     }
	              }
	              return medal;
	       }
	       public static void main(String[] ar)
	       {
	              HashMap<String,Integer> stu = new HashMap<>();
	              Students p = new Students();
	              
	              Scanner in = new Scanner(System.in);
	              System.out.println("Enter number of students:");
	              int n= in.nextInt();
	              
	              for (int i = 0; i < n; i++) {
	            	  System.out.println("Enter the student registration number");
	                  String a = in.next();
	                  System.out.println("Enter marks of student");
	                  Integer b = in.nextInt();
	                  stu.put(a, b);
	              }
	              
	              for(Map.Entry<String, Integer> pair: stu.entrySet()) {
	            	  System.out.println(pair.getKey() + "->" + pair.getValue());
	            	}
	                 

	              System.out.println(p.getStudent(stu));

	              
	              }
	       }

	
	


