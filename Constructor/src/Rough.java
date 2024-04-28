class Human{
	private int eyes;
	private String name;
	
//	Human(){
//		System.out.print("java");
//	}
	Human(int a){//constructor overloading.
		System.out.println(a);
	}
	Human(){
		System.out.print("java programmer");
	}
	int Human(int b) {
		return b;
	}
	String Human(String name){
		return name;
	}
}


public class Rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human ref=new Human();
		System.out.println(ref.Human(5));
		System.out.println(ref.Human(57));
		
		
	}

}
