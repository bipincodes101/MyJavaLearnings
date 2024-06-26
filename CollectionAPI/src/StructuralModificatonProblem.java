import java.util.*;
public class StructuralModificatonProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		/*
		for(Object obj : al) {
			System.out.println(obj);//here ConcurrentModificationException .//it falied fast and Iterator is also fail fast.
			al.add(40);
		}
		*/
	/*
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
			al.add(50);//here when we accessing the object from the collection and also adding then concurrent modification or Structural modification exception cames means adding object printed infinite times.
		}
		*/
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			al.add("bipin");//it fail fast and give ConcurrentModificationException
			//here abnormal termination is happened.
		}
	}

}
