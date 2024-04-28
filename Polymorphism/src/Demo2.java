//it is run time polymorphism
class Table {
	public void display() {
		System.out.println("use for everything");
	}

	public void Price() {
		System.out.println("price under 5000");
	}
}

class StudyTable extends Table {
	public void display() {
		System.out.println("for the only study purpose");
	}
	public void Price() {
		System.out.println("price under 2000");
	}
}

class DinningTable extends StudyTable{
	public void display() {
		System.out.println("for the only dinning table");
	}
	public void Price() {
		System.out.println("price under 3000");
	}
}

class ThingsTable extends Table{
	public void display() {
		System.out.println("for the put the things");
	}
	public void Price() {
		System.out.println("price under 4000");
	}
}

class Conclusion {
	public void display(Table st) {
		st.display();
		st.Price();
	}
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudyTable st=new StudyTable();
		DinningTable dt=new DinningTable();
		ThingsTable tt=new ThingsTable();
		Conclusion c=new Conclusion();
		c.display(st);
		c.display(dt);
		c.display(tt);
		
		
	}

}
