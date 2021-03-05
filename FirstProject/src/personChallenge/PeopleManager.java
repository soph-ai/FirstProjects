package personChallenge;

import java.util.ArrayList;

public class PeopleManager {

	ArrayList<Person> personList = new ArrayList<>();

	public void addPeople(Person person) {
		personList.add(person);

	}

	public void printPeople() {
		for (int i = 0; i < personList.size(); i++) {

			Person actualPerson = personList.get(i);
			actualPerson.printPerson();
		}
	}
}
