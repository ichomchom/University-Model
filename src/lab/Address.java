package lab;

public class Address {
private String number;
private String street;
private String city;
private String state;
private String zip;
public Address(String number, String street, String city, String state, String zip){
    this.number = number;
    this.street = street;
    this.city = city;
    this.state = state;
    this.zip = zip;
}
public String toString(){
    return number + " " + street + "\n" + city + "," + " " + state + "\n" + zip;
}
}