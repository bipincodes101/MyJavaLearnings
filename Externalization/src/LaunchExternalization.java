import java.io.*;
//serialization in externalization manner.
class Car implements Externalizable{
	transient String name ;
	int cost;
	String color;
	String brand;
	public Car(){
		System.out.println(" public zero arg constructor is called..");
	}
	 Car(String name,int cost,String color,String brand){
		this.name=name;
		this.cost=cost;
		this.color=color;
		this.brand=brand;
	}
	@Override
	public void writeExternal(ObjectOutput oo) throws IOException {
		System.out.println("writeExternal() method is called");
		oo.writeObject(name);
		oo.writeObject(cost);
		oo.writeObject(color);
	}
	@Override
	public void readExternal(ObjectInput oi) throws IOException, ClassNotFoundException {
		System.out.println("readExternal() method is called");
		name=(String)oi.readObject();
		cost=(int)oi.readObject();
		color=(String)oi.readObject();
		
	}
}
	
public class LaunchExternalization {
	public static void main(String[] args)throws IOException,ClassNotFoundException {
		// TODO Auto-generated method stub
		Car c=new Car("farari",90000,"red","hyundai");
		String fileName="driver.ser";
		System.out.println("serialization is started....");//
		FileOutputStream fos=new FileOutputStream(fileName);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c);
		System.out.println("serialization is ended....");
		System.in.read();
		System.out.println("de-serialization is started...");
		FileInputStream fis=new FileInputStream(fileName);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Car c1=(Car)ois.readObject();
		System.out.println(c1.brand+"==>"+c1.color+"==>"+c1.cost+"==>"+c1.name);
		System.out.println("de-serialization is ended...");
	}

}
