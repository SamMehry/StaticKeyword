package StaticKeyword;

public class StaticVariableCounterDemo {

	static int count = 0; // if you make the variable non-static it will only print value 1 for each new
							// object otherwise it will increment value of each object by 1.

	public StaticVariableCounterDemo() {

		count++;
		System.out.println(count);

	}

	public static void main(String[] Args) {

		StaticVariableCounterDemo a = new StaticVariableCounterDemo();
		StaticVariableCounterDemo b = new StaticVariableCounterDemo();
		StaticVariableCounterDemo c = new StaticVariableCounterDemo();
		StaticVariableCounterDemo d = new StaticVariableCounterDemo();
		StaticVariableCounterDemo e = new StaticVariableCounterDemo();


	}

}
