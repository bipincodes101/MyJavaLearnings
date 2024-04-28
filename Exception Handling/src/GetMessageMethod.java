class Jack{
	void show() {
		try {
			int arr[]=new int [3];
			System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a.getMessage());//getMessage() method prints the description of the exception
			System.out.println("exception in show method");
		}
		
		System.out.println("program is terminated");
		
	}
}
public class GetMessageMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jack j=new Jack();
		j.show();
	}

}
