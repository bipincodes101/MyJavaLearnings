class Dam {
	static int count;

	static int display() {
		count++;

		return count;
	}
}
//here method is static so only one copy is used for all objects but for not-static method new object is created with how much times object is created.

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dam std = new Dam();
		Dam std1 = new Dam();
		Dam std2 = new Dam();
		Dam std3 = new Dam();
		System.out.println(std.display());
		System.out.println(std1.display());
		System.out.println(std2.display());
		System.out.println(std3.display());

	}

}
