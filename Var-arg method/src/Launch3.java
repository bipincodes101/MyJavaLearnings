class Finds{
	public void display(int ...arr) {//if no method is mathching or called then var-arg method is used as default method.
		System.out.println("i am var-arg method");
	}
	public void display(int arr) {
		System.out.println("i am int method");
	}
	public void display(int arr,int arr2) {
		System.out.println("i am two argument method");
	}
	public void display() {
		System.out.println("i am null arguemnt method");
	}
}
public class Launch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Finds d=new Finds();
			d.display();//null argument.
			d.display(3,4);//two argument.//d.display(new int []{3,4}
			d.display(5);//int method.//d.display(int arr)
			d.display(6,5,6,7);//var-arg method. //d.display(new int []{6,5,6,7}.
			d.display(5,5,5,4,4,5);//var-arg method. //d.display(new int []{5,5,5,4,4,5}
	
	}

}
