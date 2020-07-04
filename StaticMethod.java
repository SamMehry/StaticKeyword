package StaticKeyword;

public class StaticMethod {

	/*
	 * 1. Static method belongs to the class, not to the object 2. A static method
	 * can be accessed directly by class name and does'nt need any object. 3. A
	 * static method can access only static data. it cannot access non-static data
	 * (instance data). 4. A static method can call only other static methods and
	 * cannot call a non static method. 5. a static method cannot refer to "this" or
	 * "super: keyword in anyway.
	 */

	public StaticMethod() {

	}

	static int amount;

	static void test() {

		amount = 0;
		System.out.println("----Static Method-Inner-------");
	}

	void show() {

		System.out.println("------non static method-------");
	}

	static void display() {

		amount = 10;

		test();

		// this.amount = 0; // cannot call a non static data and cannot use "this" or
		// "super" keywords
		// show();// calling non static method (show) in a static method -> doesn't work
		// :(
		System.out.println("--------Static Method-------");
		System.out.println("1");
		System.out.println("2");

	}

	public static void main(String[] args) {

		// calling static method

		display();// Calling method by method name
		StaticMethod.display();// calling method by class name because it belongs to class not object

		// calling non static method

		StaticMethod a = new StaticMethod();// we have to create object of the class to call a method.

		a.show();// a is object variable and show is the non static method

	}

}
