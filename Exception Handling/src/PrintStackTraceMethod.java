class Rawn{
	void display() {
	try {
		int arr[]=new int [3];
		System.out.println(arr[6]);
	}
	catch(ArrayIndexOutOfBoundsException a) {
		a.printStackTrace();//printStackTrace method prints the name,description and Stackframe of the methodName where exception is occured.
		System.out.println("exception in show method");
	}
	
	System.out.println("program is terminated");	
	}
}
public class PrintStackTraceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rawn r=new Rawn();
		r.display();
	}

}