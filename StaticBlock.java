package StaticKeyword;

public class StaticBlock {

	/*
	 * 1. static block executes automatically when the class is loaded in the
	 * memory, means, static block executes before main method. In Java versions
	 * before 1.6 we didn't need to create main method to call static block.
	 */

	static {// static block
		System.out.println("--Static Block 1 --");// static blocks and static variables will be executed before main
													// method regardless of the
													// location.
		//System.exit(0);// The java.lang.System.exit() method exits current program by
		// terminating
		// running Java virtual machine. This method takes a status code. A non-zero
		// value of status code is generally used to indicate abnormal termination.
	}

	 String show() {

		return "--Non Static Method--";

	}

	static {// we can have multiple static blocks. It executes top to bottom.
		System.out.println("--Static Block 2--");

	}

	public static void main(String[] args) {

		System.out.println("--Now...I am in main method--");
		// we haven't called static block but it will be executed automatically.
		
		StaticBlock a = new StaticBlock();// creating object to call non static method
		System.out.println(a.show());
		a.show();
		
	}

	static {
		
		int a = 3;
		System.out.println("--Static Block "+ a +"--");// static variable inside static block
	}
}
