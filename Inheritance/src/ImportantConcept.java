class Neo1{
	int a,b;
	Neo1(){//it is called
		
		System.out.println("Default constructor");
	}
	Neo1(int g,int h){
		this.a=g;
		this.b=h;
		System.out.println("parameterized constructor");
	}

}
class Neo2 extends Neo1{
	int x,y;
	Neo2(){//as default constructor it is executed first.
		this(10,15);//it call the parameterized constructor of same class.
	}
	Neo2(int a,int b){//so,this constructor will be called.
		//if here is not this method then super()method is present and called parent class constructor.
//		super();
		this.a=a;
		this.b=b;
	}
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}

public class ImportantConcept {

	public static void main(String[] args) {
		
		Neo2 n=new Neo2();//here child class object is created and defaut constuctor is called.
		n.display();
	}

}
