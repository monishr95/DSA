package objects;

class Dog1 {
	String name;
	String color;
	int cost;

	void eat() {
		System.out.println("dog is eating");
	}

	void sleep() {
		System.out.println("dog is sleeping");
	}

	void bark() {
		System.out.println("dog is barking");
	}
}

public class ObjectsExample1 {
	public static void main(String[] args) {
		
		//object is created
		Dog1 d=new Dog1();
		d.eat();
		d.sleep();
		d.bark();
		
		//new object is created
		Dog1 d1=new Dog1();

		d1.name="chintu";
		d1.color="black";
		d1.cost=25000;
		
		System.out.println(d1.name);
		System.out.println(d1.color);
		System.out.println(d1.cost);
	}
}
