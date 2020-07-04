package StaticKeyword;

/*In Java, static is a keyword used to describe how objects are managed in memory. It means that the static object belongs specifically to the class, instead of instances of that class. 
Static classes are basically a way of grouping classes together in Java. Java doesn't allow you to create top-level static classes; only nested (inner) static classes. 
*/

public class StaticNestedInnerClass {

	static String value = "Value of Static Variable";// static variable

	static class inner {// static inner class

		void display() {
			System.out.println("Inner Class: " + value);
		}

		static {// static method in the static inner class will run first before any other
				// class/methods
			System.out.println("Static Inner Class");
		}

	}

	public static void main(String[] args) {
		// create object
		// Syntax: outter.inner object = new outter.inner();

		StaticNestedInnerClass.inner object = new StaticNestedInnerClass.inner();

		object.display();

		StaticNestedInnerClass.inner object1 = new StaticNestedInnerClass.inner();

		object1.display();

	}

}
