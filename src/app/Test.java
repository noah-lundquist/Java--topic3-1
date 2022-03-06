package app;

import java.util.Arrays;

public class Test {
	
	
	public static void main(String [] args)
	{
		//create person
	Person[] persons = new Person[4];
	persons[0] = new Person("Justine", "Meha", 17);
	persons[1] = new Person("Brianna", "Aeha" , 20);
	persons[2] = new Person("Mary", "Reha", 50);
	persons[3] = new Person("Mark", "Reha", 50);
	/*
	Person person1 = new Person("Justine", "Reha");
	Person person2 = new Person("Justine", "Reha");
	Person person3 = new Person(person1);
	*/
	//calls sort 
	Arrays.sort(persons);
	
	//loops and prints full names sorted by last name
	for(int x = 0; x < 4;++x)
	{
		System.out.println(persons[x].getFirstName() + " " + persons[x].getLastName());
		;
	}
	
	
	/*
	//test equality
	if(person1 == person2)
	{
		System.out.println("These persons are identical using ==");
	}
	else
		System.out.println("These persons are not identical using ==");
	
	if(person1.equals(person2))
	{
		System.out.println("These persons are identical using equals()");
	}
	else
		System.out.println("These persons are not identical using equals()");
		//test copy constructor
	if(person1.equals(person3))
	{
		System.out.println("These persons are identical using equals()");
	}
	else
		System.out.println("These persons are not identical using equals()");
	
	//print object
	
	System.out.println(person1);
	System.out.println(person2.toString());
	System.out.println(person3);
	
	//mzke a person walk and run
	
	
	person1.walk();
	person1.run();
	System.out.println("Person 1 is running " +person1.isRunning());
	person1.walk();
	System.out.println("Person 1 is running " +person1.isRunning());
	*/
	}
}
