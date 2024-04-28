
public class CreatingThreadUsingAnonymousOrInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=new Runnable() {//here i am creating the object of a class that implements runnable interface and storing into r type reference,known as inner class.
			public void run() {
				for(int i=0;i<5;i++) {
					
					System.out.println("child thread");
				}
			}
		};
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}
	}

}
