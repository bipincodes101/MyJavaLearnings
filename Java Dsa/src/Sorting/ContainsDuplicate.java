package Sorting;
import java.util.Collection;
import java.util.HashSet;

import com.bipinDsa.main.Methods;

public class ContainsDuplicate {
	public static void main(String[] args) {
		int []nums= {3,3};
		HashSet<Integer>seen= new HashSet<Integer>();
		boolean result =removeDuplicates(nums,seen);
		System.out.println(result);
		
	}
	public static boolean removeDuplicates(int[]nums,HashSet seen) {
		for(int i=0;i<nums.length;i++) {
			if(seen.contains(nums[i])) {
				return true;
			}
			seen.add(nums[i]);
		}
		return false;
	}
}
