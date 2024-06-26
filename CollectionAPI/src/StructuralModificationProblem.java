import java.util.*;
public class StructuralModificationProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
			al.add(20);
			al.add(5);
			al.get(5);
		}
	}

}
