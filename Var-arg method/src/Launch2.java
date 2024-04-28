//int var-arg method values are stored in the form of array.
class Launch{
	int total=0;
	public void show(Character...ch ) {
		for(char element:ch) {
			total+=element;
			System.out.println(element);
		}
		System.out.println(total);
	}
}
public class Launch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Launch d=new Launch();
		d.show();
		d.show('a');
		d.show('a','b');
		d.show('a','b','c');
	}

}
