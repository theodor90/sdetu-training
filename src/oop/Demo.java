package oop;


class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat(){
		System.out.println(email);
	}
	
	void sleep(){
		System.out.println(name + " is sleeping");
	}
	
}


public class Demo {

	public static void main(String[] args) {
		// Instantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Theo";
		person1.email = "theo@testmail.com";
		person1.phone = "07333211414";
		
		// Abstraction
		person1.walk();
		person1.sleep();
		person1.eat();
		
		Person person2 = new Person();
		person2.name = "Linda";
		person2.sleep();
		
		
		
		/*
		// Person-
		
		// Attributes, variables, adjectives, descriptiors
        String name = "Theo";
        String email = "theo@testemail.com";
        String phone = "07333211414";
        
        // Action, activity, behacior
        //System.out.println(name + " is walking");
        walking(name);
        System.out.println(name + " is eating");
        
        // what if we wanted to do this for another person?
        String name2 = "Linda";
        String email2 = "linda@testemail.com";
        String phone2 = "07333215151";
        
        // Action, activity, behacior
        walking(name2);
        System.out.println(name2 + " is eating");
        
        // What about binding atrributes and properties together?
	}
	
	// Enhance by adding functions to minimize code
	static void walking(String name) {
		System.out.println(name + " is walking");
		
	*/
	}


}


