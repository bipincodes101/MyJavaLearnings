interface ICountry{
	//varialbe are by default public static and final in interface.
	int x=2;
}
class People {
	public void show() {
		System.out.println(ICountry.x);
	}
	
}
public class InterfaceVariables {
	public static void main(String []args) {
		People p=new People();
		p.show();
	}
}
