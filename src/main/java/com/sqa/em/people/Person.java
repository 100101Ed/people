/**
 * File Name: People.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 30, 2016
 */
package com.sqa.em.people;

/**
 * People //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class Person {

	private String name;

	private int age;

	private String address;

	private String jobTitle;

	/**
	 * @param name
	 * @param age
	 * @param address
	 * @param jobTitle
	 */
	public Person(String name, int age, String address, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.jobTitle = jobTitle;
	}

	public void doWork() {
		System.out.println("Doing work at SQA");
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return this.jobTitle;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	public void move() {
		System.out.println("Moving, always moving");
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param jobTitle
	 *            the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public void sleep() {
		System.out.println("Sleeping, sleeping... don't bother me I am sleeping");
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "People [name=" + this.name + ", age=" + this.age + ", address=" + this.address + ", jobTitle="
				+ this.jobTitle + "]";
	}
}
