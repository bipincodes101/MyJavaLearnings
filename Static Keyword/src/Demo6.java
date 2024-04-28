class Demo7{
	static int a;//it is also known as class variables.
	{
		System.out.println("simple java block");
	}
	
	Demo7(){
		this("java");
		System.out.println("second constructor");
		
	}
	Demo7(String  a){
		System.out.println("first constructor");
		System.out.println(a);
	}
	
}
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo7 ref=new Demo7();
	}

}
