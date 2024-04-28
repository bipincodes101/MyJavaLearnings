
public class Launch4 {
		public static void display(Float l) {//Object==> Number //will bind.
			System.out.println("wrapper class");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		display(a);//first it do widening int to ====> float, double ,long.
		        //if not found do auto boxing ====>Integer.//Integer is also not present.
					//then it do widening Integer  to his parent which Number,Object.
		
	}

}
