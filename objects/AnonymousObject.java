package objects;

class Dog {
	String name;
	String color;

	void bark() {
		System.out.println("dog is barking");
	}
}

public class AnonymousObject {
	public static void main(String[] args) {

		new Dog().bark(); // AnonymousObject
	}
}
