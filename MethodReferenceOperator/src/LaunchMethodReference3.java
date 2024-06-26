@FunctionalInterface
interface interface5{
	public void get(String s);	
}
public class LaunchMethodReference3 {
	public  void set(String a) {
		System.out.println("method is called by :"+a);
	}
	
	public static void main(String[] args) {
		//binding the set body with get method.
		interface5 i=new LaunchMethodReference3()::set;
		i.get("method reference");

	}

}
