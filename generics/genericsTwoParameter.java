package generics;

class CapitalCity<K,V>{
	K country;
	V capital;
	CapitalCity(K country,V capital){
		this.country=country;
		this.capital=capital;
	}
	
	public void display() {
		System.out.println("The capital city/code of "+this.country+" is "+this.capital);
	}
	
}


public class genericsTwoParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CapitalCity<String,String> capital=new CapitalCity<String,String>("Nepal","Kathmandu");
			capital.display();
			
		CapitalCity<String,Integer> countryCode=new CapitalCity<String,Integer>("Nepal",23); 
		countryCode.display();
	}

}
