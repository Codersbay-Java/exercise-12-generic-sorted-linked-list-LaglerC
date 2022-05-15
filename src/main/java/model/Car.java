package model;

public class Car implements Comparable<Car> {

	String color;

	public Car(String color) {
		super();
		this.color = color;
	}

	public Car() {

	}

	@Override
	public int compareTo(Car o) {
		return this.color.compareTo(o.color);
	}

	public String toString() {
		return color;
	}

}