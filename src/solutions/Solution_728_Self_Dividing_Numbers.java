import java.util.ArrayList;
import java.util.List;

public class Solution_728_Self_Dividing_Numbers {

	public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> numberList = new ArrayList<>();
        for(int i=left; i<=right; i++) {
        	int flag = 0;
        	char[] charArray = String.valueOf(i).toCharArray();
        	for(char c: charArray) {
        		System.out.println(c);
        		if (c == '0') {
        			System.out.print("is equals 0");
        			flag = 1;	// key
        			break;
        		}
        		if (i % Integer.parseInt(String.valueOf(c)) != 0) {
        			flag = 1;
        		}
        	}
        	System.out.println();
        	if (flag == 0) {
        		numberList.add(i);
        	}
        }
        return numberList;
    }
	
	public static void main(String[] args) {
		int left = 1, right = 22;
		
		Solution_728_Self_Dividing_Numbers obj = new Solution_728_Self_Dividing_Numbers();
		List<Integer> numberList = obj.selfDividingNumbers(left, right);
		
		System.out.println(numberList.toString());

	}

}
