/**
 * File Name: PeopleTest.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 30, 2016
 */
package com.sqa.em.people;

import org.junit.Test;

/**
 * PeopleTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class PeopleTest {

	@Test
	public void TestPeople() {
		Person bob = new Person("Bob", 30, "429 San Pedro, Daly City", "SQA");
		Person jb = new Person("Jone B", 25, "429 San Pedro, Daly City", " Lead SQA");
		Person smith = new Person("smith", 27, "429 San Pedro, Daly City", "Sr. SQA");
		Person[] people = new Person[] { bob, jb, smith };
		for (Person person : people) {
			System.out.println(person.toString());
		}
		// smith.toString();
	}
}
