package School;

public class Address {
	private String number;
	private String name;
	private String city;
	private String state;
	
	public Address(String number, String name, String city, String state){
		this.number = number;
		this.name = name;
		this.city = city;
		this.state = state;
	}
	
	public String toString(){
		return number + " " + name +"\n" + city + ", "+ state;
	}
}
