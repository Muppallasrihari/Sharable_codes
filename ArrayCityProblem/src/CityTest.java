import java.util.*;
public class CityTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		String input;
		CityService service=new CityService();
		do {
			System.out.println("-----------Menu--------");
			System.out.println("1.Add city");
			System.out.println("2.List cities");
			System.out.println("0.To Exit");
			System.out.println("Enter the user choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter the city name:");
				String city=sc.next();
				service.addCity(city);
				break;
			}
			case 2:{
				service.displayCities();
				break;
			}
			case 0:{
				System.out.println("--------------Thanks for using the application--------------");
				System.exit(0);
				break;
			}
			default:{
				System.out.println("Enter the correct choice");
				break;
			}
			}
			System.out.println("Do you want to continue:(Y/N)");
			input=sc.next();
			if(input.equalsIgnoreCase("n")) {
				System.out.println("------------------Thanks for using the application-------------------------");
			}
		}
		while(input.equalsIgnoreCase("y"));
		
		

	}

}
