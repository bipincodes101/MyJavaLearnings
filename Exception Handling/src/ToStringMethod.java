class Harmayni{
	void show() {
		try {
			int arr[]=new int [3];
			System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a.toString());//toString() method prints the name and  description of the exception
			System.out.println("exception in show method");
			
		}
		
		System.out.println("program is terminated");
	}
}
public class ToStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Harmayni h=new Harmayni();
		h.show();
	}

}
