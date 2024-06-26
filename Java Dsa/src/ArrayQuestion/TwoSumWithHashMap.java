package ArrayQuestion;
import java.util.Arrays;
import java.util.HashMap;
public class TwoSumWithHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {1,3,4,5,7};
		int target=9;
		HashMap <Integer,Integer> hm=new HashMap();
		int []result =pairs(nums,hm,target);
		System.out.println(Arrays.toString(result));
	}
	public static int[] pairs(int []arr,HashMap hm,int target) {
		for(int i=0;i<arr.length;i++) {
			int complement=target-arr[i];
			if(hm.containsKey(complement)) {
				return new int [] {(int) hm.get(complement),i};
			}
			hm.put(arr[i],i);	
		}
		return new int [] {-1,-1};
	}
}


