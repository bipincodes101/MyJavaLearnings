class Student {
	/*
	 * conclusion- first memory will be given for static variables in heap area then
	 * static block ,then static methods ,then memory will be givent to instance
	 * variable then normal java block then constructor getting executed.
	 * during the class loading static variables and static block activity is done.by the jvm automatically.
	 */

	// int execute during class loading and memory will be given in heap area with
	// default values.then initialization part is over.
	static int age;
	static String name;
	static float height;
//	Static blocks.
//	after static variables static block is executed and initialization part is done .
	static {
		System.out.println("i am a static block");
		age = 5;
		System.out.println(age);
	}

//	static methods execute after main method .
	static void setAge(int a) {
		age = a;
	}

	static int getAge() {
		return age;
	}
}

public class Demo1 {
	public static void main(String[] args) {
		Student std = new Student();
		std.setAge(76);
		int a = std.getAge();
		System.out.println(a);
	}
}
