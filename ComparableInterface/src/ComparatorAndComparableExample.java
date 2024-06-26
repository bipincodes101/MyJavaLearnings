import java.util.TreeSet;
import java.util.Comparator;
import java.lang.Comparable;

//this class implements Comparable interface.

//this is employee class.
class Employee implements Comparable{
	//instance variables.
	String name;
	int age;
	float id;
	
	Employee(String name,int age,float id){
		this.name=name;
		this.age=age;
		this.id=id;
	}
	
	public String toString() {
		return "name is : "+name+" age is: "+age+" id  is: "+id; 
	}
	public int compareTo(Object obj) {
		int obj1=this.age;
		Employee emp=(Employee)obj;
		int obj2=emp.age;
		if(obj1<obj2) {
			return -1;
		}else if (obj1>obj2) {
			return 1;
		}else {
			return 0;
		}
	}
	
}

public class ComparatorAndComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		Employee emp1=new Employee("bipin",19,12.18f);
		Employee emp2=new Employee("faizan",28,13.14f);
		Employee emp3=new Employee("satyam",21,19.19f);
		Employee emp4=new Employee("yash",22,10.10f);
		ts.add(emp1);
		ts.add(emp2);
		ts.add(emp3);
		ts.add(emp4);
		System.out.println(ts);
	}

}
