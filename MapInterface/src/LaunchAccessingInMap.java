import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
class Employee{
	private String name;
	private int age;
	private String department;
	private String address;
	private float weight;
	//initialiazation of constructor.
	Employee(String name,int age,String address ,String department,float weight){
		this.name=name;
		this.age=age;
		this.department=department;
		this.address=address;
		this .weight=weight;
	}
	//getters
	String name(String name) {
		return name;
	}
	int age(int age) {
		return age;
	}
	String department(String address) {
		return address;
	}
	String address(String department) {
		return department;
	}
	float weight(float weight) {
		return weight;
	}
	@Override
	public String toString() {
		return "name is : " + name +"| age is : " + age  +" |address is : " +address+ " |department is : " +department +"| weight is : "+weight;
	}
}
public class LaunchAccessingInMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee("michel",18,"california","engineering",55.5f);
		Employee emp2=new Employee("harry",18,"silicon valley","cloud",56.5f);
		Employee emp3=new Employee("jack",20,"japan","network engineer",57.5f);
		Employee emp4=new Employee("andrew",21,"singapore","devops engineer",58.5f);
		HashMap hm=new HashMap();
		hm.put(10, emp1);
		hm.put(20, emp2);
		hm.put(30, emp3);
		hm.put(40, emp4);
		System.out.println("***********************");
		System.out.println();
		System.out.println("values are :");
		Collection cl1=hm.values();
		Iterator itr1=cl1.iterator();
		while(itr1.hasNext()) {
			Object str1=itr1.next();
			System.out.println(str1);
		}
		System.out.println("***********************");
		System.out.println();
		System.out.println("keys are :");
		Collection cl2=hm.keySet();
		Iterator itr2=cl2.iterator();
		while(itr2.hasNext()) {
			Integer i=(Integer )itr2.next();
			System.out.println(i);
		}
		System.out.println("***********************");
		System.out.println();
		System.out.println("enteries are :");
		Collection cl3=hm.entrySet(); 
		Iterator itr3=cl3.iterator();
		while(itr3.hasNext()) {
		Entry entr=(Entry)itr3.next();
		System.out.println("key is :"+entr.getKey()+"| value is :"+entr.getValue());
		}
	}

}
