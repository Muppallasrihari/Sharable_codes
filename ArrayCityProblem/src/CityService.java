
public class CityService {
	 int size=5;
	 int j=0;
	 String [] cityNames=new String[size];
	 String [] cityNames1=new String[size*2];
	public  String addCity(String name) {
		
			if(cityNames[size-1]==null) {
				cityNames[j]=name;
				j++;
			}
			
		else  {
			System.arraycopy(cityNames, 0, cityNames1, 0, 5);
			cityNames=cityNames1;
			if(cityNames1[size-1]==null) {
				cityNames1[j]=name;
				j++;
			}
		}
		
		return null;
	}
	
	public  String[] displayCities() {
		for(String cityname:cityNames1) {
			if(cityname!=null) {
				System.out.println("City Name : "+cityname);
			}
			
		}
		return null;
		
		
	}



}
