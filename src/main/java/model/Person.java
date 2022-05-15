package model;

public class Person implements Comparable<Person> {

	Integer age;

	public Person(int age) {
		super();
		this.age = age;
	}

	public Person() {

	}

	@Override
	public int compareTo(Person o) {
		return this.age.compareTo(o.age);
	}

}