class Naruto extends Thread{
	public void run() {
		System.out.println("child thread priority is :"+Thread.currentThread().getPriority());//Thread.currentThread()method is used for print priority of thread like 5.
	}
}
public class PriorityThread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main thread priority is :"+Thread.currentThread().getPriority());
Naruto n=new Naruto();
n.start();//in this program priority is same so thread scheduler used the some algorithm to execute by giving specific time.
	}

}
