package School;

public class Person {
	protected String name;
	
	protected Address address;
	
	public Person(String name, Address address  ){
		this.name = name;
		this.address = address;
	}
	
	public Person(){}
	
	public String getName(){
		return name;
	}
	
	public Address getAddress(){
		return address;
	}
	
	public String toString(){
		return name + "\n"+ address;
	}
	
}
