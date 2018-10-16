
public class BinarySearch {
	public boolean doSearch(int nums[], int n){
		int low = 0;
		int high = nums.length;
		int mid = (low + high)/2;
		while(low <= high){
			if(n == nums[mid]){
				return true;
			}else if(n < nums[mid]){
				low = mid + 1;
			}else{
				high = mid - 1;
			}
		}
		return false;
	}
}
