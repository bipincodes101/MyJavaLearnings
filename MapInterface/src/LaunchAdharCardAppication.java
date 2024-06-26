import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Collection;
class AadharCard{
	//global variable or instance variable.
	 private String name;
	private String fatherName;
	private String motherName;
	private String adharNumber;
	private int age;
	private String address;
	private String mobileNumber;
	//constructor  initialization
	AadharCard(String name,String fatherName,String motherName,String adharNumber,int age,String address,String mobileNumber){
		this.name=name;
		this.fatherName=fatherName;
		this.motherName=motherName;
		this.adharNumber=adharNumber;
		this.age=age;
		this.address=address;
		this.mobileNumber=mobileNumber;
	}
	//getters method.
	public String name(String name) {
		
		return name;
	}
	public String fatherName(String fatherName) {
		return fatherName;
	}
	public String motherName(String motherName) {
		return motherName;
	}
	public int adharNumber(int adharNumber) {
		return adharNumber;
	}
	public int age(int age) {
		return age;
	}
	public String address() {
		return address;
	}
	public String mobileNumber() {
		return mobileNumber;
	}
	@Override
	public String toString() {
		return "name :"+name+" |father Name : "+fatherName+" | motherName : "+motherName+ " | adhar number : "+adharNumber+" | age "+age+"| address :"+address+" | mobile number :"+mobileNumber;
	}
	
}
//class Key1{
//	int  firstKey;
//	public Key1(int firstKey){
//		this.firstKey=firstKey;
//	}
//	
//}
//class Key2{
//	String secondKey;
//	
//	public Key2(String secondKey){
//		this.secondKey=secondKey;
//	}
//	
//}
//class Key3{
//	String thirdKey;
//	
//	public Key3(String thirdKey){
//		this.thirdKey=thirdKey;
//	}
//	
//}

public class LaunchAdharCardAppication {

	public static void main(String[] args) {
		int myKey=0;
		boolean flag=false;
		// TODO Auto-generated method stub
		AadharCard ac1=new AadharCard("bipin","vijay kumar pal ","suman lata pal ","583116120900",19,"ratanpur colony ", "8917859195");
		AadharCard ac2=new AadharCard("aditya","mansa ram ","urmila ","84794747848474",20,"panki ", "9569426817");
		AadharCard ac3=new AadharCard("anand","avdhesh rajpoot ","rani rajpoot ","498474847",18,"gambhirpur ", "9554959517");
		
//		//object of keys
//		Key1 k1=new Key1(123);
//		
//		Key2 k2=new Key2("second adhar card");
//		
//		Key3 k3=new Key3("third adhar card");
		
		
		
		//Storing values in Hashmap.
		HashMap hm=new HashMap();//tight coupling
		hm.put(111, ac1);
		hm.put(222, ac2);
		hm.put(333, ac3);
		
		//calling entrySet method to access entries.
		Collection cl=hm.entrySet();
		//calling iterator.
		Iterator itr=cl.iterator();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your key to see information: ");
		try {
			myKey=sc.nextInt();
		}
		catch(InputMismatchException ime) {
			flag=true;
			System.out.println("please give numeric value not any character or string :");
			System.out.println("please retry , give the key :");
			myKey=sc.nextInt();
		}
		
		while(itr.hasNext()) {
			Map.Entry entr=(Map.Entry)itr.next();
			Integer key=(int)entr.getKey();
			if(key==myKey) {
				System.out.println("value is :|| "+entr.getValue()+" |key is :"+entr.getKey());
				System.exit(0);
			}
		}
		if(flag==false) {
			System.out.println("######*******############****####");
			System.out.println("sorry ! you entered wrong key you can't see information");
			System.out.println("please try once more , give the key :");
			myKey=sc.nextInt();
		}
		
	}

}
