//default keyword is used to change interface property remove abstract method property.
interface IDemo1{
	 public static    void display() {//static method is not implements of interface.
		System.out.println("hello java");
    }
	 default public void show() {
		 System.out.println("a good programmer has problem solving skills");
	 }
} 
  class Demo implements IDemo1{
	
   }

public class Launch1 {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		IDemo1 d=new Demo();
		d.display();//display method is static .
		//IDemo1.display();
		d.show();
		
	}

}
