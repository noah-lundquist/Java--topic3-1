package app;
public class Person implements PersonInterface, Comparable<Person> {
	
	private String firstName = "Mark";
	private String lastName = "Reha";
	private int age;
	private boolean running;
	
	
	public Person(String firstName, String lastName, int age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public Person(Person person)
	{
		this.firstName = person.getFirstName();
		this.lastName = person.getLastName();
		this.age = getAge();
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	public int getAge()
	{
		return age;
	}
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("I am walking");
		running = false;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I am running");
		running = true;
		
	}
	@Override
	public boolean isRunning() {
		// TODO Auto-generated method stub
		return running;
	}
	@Override
	public int compareTo(Person p) {
		// TODO Auto-generated method stub
		int value = this.lastName.compareTo(p.lastName);
		
		if(value == 0)
		{
			return this.firstName.compareTo(p.firstName);
		}
		else {
			return value;
		}
		
		
	}
	
	
}