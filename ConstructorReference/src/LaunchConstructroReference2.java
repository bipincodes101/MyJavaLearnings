class Demo1{
	int a;
	Demo1(int a){
		
		this.a=a;
		if(a>5) {
			System.out.println("value is greater");
		}else {
			System.out.println("bhaad me jao");
		}
	}
}
interface interface1{
	public Demo1 start(int a) ;
		
	
}
public class LaunchConstructroReference2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface1 i1=Demo1::new;
		i1.start(6);
		i1.start(3);
		
	}

}
