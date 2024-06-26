import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Rough1 {
	public static void main(String[] args) {
	int []arr= {-1,0,1,2,-1,-4};
	int [][]result=sum(arr);
	System.out.println((result));
	}
	public static int [][]sum(int []arr){
		HashMap<Integer,Integer> hm=new HashMap<>();
		List<Integer[]> result=new ArrayList<>();
		
		for(int i=1;i<arr.length;i++) {
			
			int complement=arr[i]+arr[i-1]-0;
			if(hm.containsKey(complement)) {
				Integer []prev= {arr[i],arr[i-1],arr[complement]};
				result.add(prev);
			}else {
				hm.put(complement, i);
			}
		  }
		return result.toArray(new int [result.size()][]);
		
	}
}

