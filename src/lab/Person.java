package lab;
import java.util.Scanner;

public class Person {
Scanner in = new Scanner(System.in);
public String name;
public String phone;
public String email;
public Address address;

public Person(String name, String phone, String email, Address address){
    this.name = name;
    this.phone = phone;
    this.email = email;
    this.address = address;
}
public Person(){}

public String getName(){
    return name;
}
public String getPhone(){
    return phone;
}
public String getEmail(){
    return email;
}
public Address getAddress(){
    return address;
}
public String toString(){
    return name + "\n" + address + "\n" + phone + "\n" + email;
}
}