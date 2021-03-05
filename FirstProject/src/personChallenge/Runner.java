package personChallenge;

public class Runner {

	public static void main(String[] args) {
		Person person1 = new Person("Soph", 23, "Software Engineer");
		Person person2 = new Person("Geoff", 49, "Skier");

		PeopleManager pm = new PeopleManager();
		pm.addPeople(person1);
		pm.addPeople(person2);
		pm.printPeople();

	}

}
