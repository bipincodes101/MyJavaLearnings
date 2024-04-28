class Dmo5{
	static  int count;
	int a;
	int b;
//	here we can see first non-static block is executed then actual constructor body will be executed internally.
	{
		count++;
	}
	Dmo5(){	
	}
	Dmo5(int a){
		this.a=a;	
	}
	Dmo5(int a,int b){
		this.b=b;
	}
	
}

	public class Demo5{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dmo5 ref=new Dmo5();
		Dmo5 ref1=new Dmo5(10);
		Dmo5 ref2=new Dmo5(10,20);
		System.out.println(Dmo5.count);
		
	}

}
