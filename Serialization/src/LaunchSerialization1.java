//javap java.io.FileOutputStream
// public java.io.ObjectOutputStream(java.io.OutputStream) throws java.io.IOException;
 //public final void writeObject(java.lang.Object) throws java.io.IOException;
//  public java.io.FileInputStream(java.lang.String) throws java.io.FileNotFoundException;

///note:-when we de-serialize the object then order of serialization will be kept.
import java.io.*;
class Human implements Serializable{
	//before the object instantiation static block gets executed.
	static {
		System.out.println("static block gets executed");
	}
	 Human(){
		System.out.println("constructor called:");
		
	}
	 String name="bipin pal";
	 //if a variable have both final or static and transient combination the transient not work . because final and static variable not participate in serialization. 
	final transient int age=18;
	static transient String course="bca";
}
//another class.
class Person implements Serializable{
	static {
		System.out.println("static block geting executed....");
	}
	Person(){
		System.out.println("persong constructor is called....");
	}
	//transient keyword is used to hide variable in serialization.
	transient  String name="chotu pal";
	transient  String course="public speaking";
	transient int age=19;
}
public class LaunchSerialization1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		Human h=new Human();//human object is created.
		Person p=new Person();//person object is created.
		System.out.println("serilaization is started.....");
		String file="intor.ser";
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(h);
		oos.writeObject(p);
		System.out.println("serilaizaton is ended.....");
		
		System.in.read();//pause the execution till programmer not press any key.
		/*when de-serialization block is executed then object is created but constructor is not called because object is created by readObject method internally.*/
		System.out.println("de-serailization is started.....");
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object obj=ois.readObject();
		Human obj1=(Human)obj;
		Person obj2=(Person)ois.readObject();
		System.out.println("human object  data is : "+obj1.name+"=====>"+obj1.course+"=====>"+obj1.age);
		System.out.println("Persong object data is : "+obj2.name+"====>"+obj2.age+"=====>"+obj2.course);
		System.out.println("de-serialization is ended");
		ois.close();
		}

}
