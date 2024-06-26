//to remove fast fail or concurrent modification exception we use CopyOnWriteArrayList Class.
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;


public class CopyOnWriteArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*in fail safe we use CopyOnWriteArrayList Package so it not give any fast fail exception or infinity repeated value it ignores the adding value after the accessing the object from the collection*/
		CopyOnWriteArrayList cal=new CopyOnWriteArrayList();//fail safe
		cal.add(10);
		cal.add("bipin");
		cal.add(20);
		cal.add(30);
		cal.add(40);
		cal.add(50);
		 
		Iterator itr=cal.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			cal.add("new");
		}
		
		
	}

}
