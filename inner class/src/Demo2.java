 class Launch{
	 public void show() {
		 System.out.println(" i am outer class");
	 }
 }
 public class Demo2{
	 
	 public static void main(String[]args) {
		 Launch l=new Launch() 
		 {//this is anonyms class means no name.
			public void show() {
				System.out.println("i am anonyms class means no name sign $1");
			}
		 };
		 l.show();
	 }
 }
