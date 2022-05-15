package model;

public class Animal implements Comparable<Animal> {

	String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public Animal() {

	}

	@Override
	public int compareTo(Animal o) {
		return this.name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return name;
	}
}
