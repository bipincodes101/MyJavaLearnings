class Way{
	public void display(int arr,String ...str) {
		System.out.println("var-arg method");
		System.out.println(str[0]);
		System.out.println(arr);
	}
}
public class Launch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Way w=new Way();
		w.display(1, "java","datascience");
		w.display(7,new String  [] {"servlet","spring boot"});
	}

}
