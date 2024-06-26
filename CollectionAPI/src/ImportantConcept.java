import java.util.*;
public class ImportantConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList(); //tight coupling.
		List l=new LinkedList();//loose coupling//peek(),poll() method is not there because it is not in List interface .
		/*in java we can't access specilaized method using parent reference.*/
		Deque d=new LinkedList() ;//here we can access peek() method.
		
		
	}

}
