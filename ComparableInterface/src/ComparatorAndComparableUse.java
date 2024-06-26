import java.util.*;

//use of comparator .

class MyComparatorEmployee implements Comparator{
	@Override
	public int compare(Object obj1,Object obj2) {
		Employeers emp1=(Employeers)obj1;
		Employeers emp2=(Employeers)obj2;
		Integer value1=emp1.weight;
		Integer value2=emp2.weight;
		 return value1.compareTo(value2);
		
		
		
	}
}
class Employeers implements Comparable<Object>{
	String name;
	int weight;
	Employeers(String name,int weight){
		this.name=name;
		this.weight=weight;
	}
	public String toString() {
		return "name= "+name+" weight= "+weight;
	}
	@Override
	public int compareTo(Object obj){//obj1.compareTo(obj2).
		String str1=this.name;
		int num1=str1.length();
		Employeers emp=(Employeers)obj;
		String str2=emp.name;
		int num2=str2.length();
		if(num1<num2) {
			return -1;
		}else if(num1>num2) {
			return 1;
		}else {
			return 0;
		}
	}
}
public class ComparatorAndComparableUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet <Employeers>ts=new TreeSet<Employeers>();
		ts.add(new Employeers("bipin",40));
		ts.add(new Employeers("faizan",35));
		ts.add(new Employeers("yash",80));
		ts.add(new Employeers("satyams",60));
		System.out.println(ts);
		System.out.println("=========================");
		TreeSet<Employeers> ts1=new TreeSet<Employeers>( new MyComparatorEmployee());
		ts1.add(new Employeers("bipin",40));
		ts1.add(new Employeers("faizan",35));
		ts1.add(new Employeers("yash",80));
		ts1.add(new Employeers("satyams",60));
		System.out.println(ts1);
	}

}
