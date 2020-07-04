package StaticKeyword;

public class VariableStaticKeyword {

	int empid; // Non-static Variable OR Instance Variable
	String name; // Non-static Variable OR Instance Variable
	static String organization = "TEK"; //Static Variable  OR Class Variable
	
	
	public VariableStaticKeyword() {//constructor

		this.empid = empid;
		this.name = name;

	}

	public VariableStaticKeyword(int empid, String name) {//constructor

		this.empid = empid;
		this.name = name;

	}

	public void display() {//method
		
		System.out.println(empid + name + organization);

	}

	public static void main(String[] args) {//runner class

		VariableStaticKeyword a = new VariableStaticKeyword(101, "John");
		
		VariableStaticKeyword b = new VariableStaticKeyword(102, "Bob");

		VariableStaticKeyword c = new VariableStaticKeyword();
		
		
		a.display();
		b.display();
		
		VariableStaticKeyword.organization = "Tek School"; // calling a variable without creating an object
		
	

	}

}
