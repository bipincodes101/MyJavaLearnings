class Sea extends Thread{
	public void run() {
		Thread.currentThread().setName("bipin pal");
		String str=Thread.currentThread().getName();
		System.out.println("child class is executed by "+str+" (thread)");
		
	}
}
public class KnowThreadName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=Thread.currentThread().getName();//getName() is a type of getter.used for print thread name.
		System.out.println("main method is executed by : "+str);
		Sea j=new Sea();
		j.start();
		Thread.currentThread().setName("bipin pal");//it is setters used for set the thread name.
		String str1=Thread.currentThread().getName();
		System.out.println("main thread name changed that is  main to "+str1);
//		Thread.currentThread().setName("bipin pal bca ratanpur");
//		System.out.println(10/0);
	}

}
