package personChallenge;

public class Person {

	// instance variables
	public String name;
	public int age;
	public String jobTitle;

	// constructor
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public void printPerson() {

		System.out
				.println("Hi, I'm " + this.name + " I'm " + this.age + " years old and I am a " + this.jobTitle + "!");

	}
}
