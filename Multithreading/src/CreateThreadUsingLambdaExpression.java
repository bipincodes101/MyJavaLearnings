//only one dot class file is generated.
public class CreateThreadUsingLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=()->{
			for(int i=0;i<5;i++) {
				System.out.println("child thread ");
			}
		};
		Thread t=new Thread(r);
		t.start();
	 for(int i=0;i<4;i++) {
		 System.out.println("main thread");
	 }
	}

}
