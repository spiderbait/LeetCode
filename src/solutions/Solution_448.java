import java.util.ArrayList;
import java.util.List;

public class Solution_448 {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i=1;i<=nums.length;i++){
        	res.add(i);
        }
        System.out.println(res);
        for(int i=0;i<nums.length;i++){
        	if(res.contains(nums[i])){
        		res.remove(res.indexOf(nums[i]));
        	}
        }
        return res;
    }
	
	public static void main(String[] args){
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));
	}
}
