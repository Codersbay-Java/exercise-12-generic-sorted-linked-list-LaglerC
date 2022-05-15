package application;

import java.util.LinkedList;
import java.util.List;

import model.Animal;

public class Main {
	public static void main(String[] args) {

		Animal Affe = new Animal("Affe");
		Animal Bär = new Animal("Bär");
		Animal Pfau = new Animal("Pfau");

//		SortedLinkedList<Animal> animalList = new SortedLinkedList<>();

//		animalList.insert(Affe);
//		animalList.insert(Bär);
//		animalList.insert(Pfau);
//
//		System.out.println(animalList);

		List<Animal> animalList = new LinkedList<>();

		animalList.add(Affe);
		animalList.add(Bär);
		animalList.add(Pfau);

		System.out.println(animalList);

//		Car Seat = new Car("blue");
//		Car Audi = new Car("black");
//		Car BMW = new Car("white");
//
//		SortedLinkedList<Car> carList = new SortedLinkedList<>();
//
//		carList.insert(Seat);
//		carList.insert(Audi);
//		carList.insert(BMW);
//
//		System.out.println(carList);
//
//		Person Susi = new Person(15);
//		Person Hans = new Person(30);
//		Person Peter = new Person(45);
//
//		SortedLinkedList<Person> personList = new SortedLinkedList<>();
//
//		personList.insert(Susi);
//		personList.insert(Hans);
//		personList.insert(Peter);
//
//		System.out.println(personList);

	}
}
