package objects;

class Demo {
	int a, b;
	static int x, y;

	{
		System.out.println("non static block  entered");
		a = 10;
		b = 20;
		System.out.println("non static block  exited");

	}
	static {
		System.out.println("non static block  entered");
		x = 100;
		y = 200;
		System.out.println("non static block  exited");

	}

	Demo() {
		System.out.println("constructor 0-parametarised entered");

		System.out.println("constructor 0-parametarised exited");

	}

	void display1() {
		System.out.println("non static method  entered");
		System.out.println(a);
		System.out.println(b);
		System.out.println("non static method  exited");

	}

	static void display2() {
		System.out.println("static method  entered");
		System.out.println(x);
		System.out.println(y);
		System.out.println("static method  exited");
	}
}

public class LaunchDemo {
	public static void main(String[] args) {
		Demo.display2();
		Demo d = new Demo();
		d.display1();
	}
}
