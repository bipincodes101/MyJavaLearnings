class Dog{
	String colour;
	int price;
	Dog(){
		System.out.println("java");
	}
	Dog(int a){
		this("java");
		System.out.println(a);
	}
	Dog(String name){
		this();
		System.out.println("proven");
	}
	
}




public class Rough2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog ref=new Dog(4);
		ref=new Dog(4);
		ref=new Dog();
	
	}

}
