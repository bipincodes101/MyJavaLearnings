import java.util.*;
import java.util.Map.Entry;//entry is inner interface of Map.So Map.entry().
public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();//not preserved order of insertion.
		System.out.println(hm.put(0, "got null in this case "));
		hm.put(1, "bipin");
		hm.put(80, "aditya");
		hm.put((81), "anand");
		hm.put(17, "prince");
		hm.put(85 ,"prince");
		System.out.println("first entry of childhood friends :"+hm);
		//accessing the only value.
		Collection values =hm.values();
		
		System.out.println("iterator is used");
		//using of iterator to access values.
		Iterator itr1=values.iterator();
		while(itr1.hasNext()) {
			String str1=(String)itr1.next();
			System.out.println("using iterator values are :"+str1);	
		}
		
		
		
		
		System.out.println("==============================");
		System.out.println();
		//accessing the key.
		Set keys =hm.keySet();
		System.out.println("keys is :"+keys);
		
		/* using iterator access the keys*/
		Iterator itr2=	keys.iterator();
		while(itr2.hasNext()) {
			int a=(int)itr2.next();
			System.out.println("keys are using iterator :"+a);
		}
		System.out.println();
		System.out.println("=============================");
		//accessing the entries.
		Set s=hm.entrySet();
		System.out.println("entry set is :"+s);
		
		System.out.println("============================");
		System.out.println();
		/*using iterator entrySet are accessing*/
		Iterator itr3=s.iterator();
		while(itr3.hasNext()) {
			Entry str3=(Entry)itr3.next();
			System.out.println("entrys are using iterator :"+str3);
			
		}
		System.out.println("****************************");
		System.out.println();
		Iterator itr4=s.iterator();
		while(itr4.hasNext()) {
			Entry entr=(Entry)itr4.next();
			System.out.println("value  is : "+entr.getValue()+" | key  is :"+entr.getKey());
		}
		System.out.println();
		System.out.println("****************************");
		System.out.println();
		System.out.println("=============================");
		
		
		LinkedHashMap lhm=new LinkedHashMap();//preserved order of insertion.
		lhm.put(1, "bipin");
		lhm.put(2, "aditya");
		lhm.put((89), "anand");
		lhm.put(17, "prince");
		lhm.put("aryanshu", 85);
		System.out.println(lhm);
		System.out.println(lhm.put(000, "again checking"));
	}

}
