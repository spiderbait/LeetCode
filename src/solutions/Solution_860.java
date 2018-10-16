//开始没有考虑20可以找零3张5的场景。

public class Solution_860 {
	
	public boolean lemonadeChange(int[] bills){
		
		int fiveCount = 0;
		int tenCount = 0;
		int twentyCount = 0;
		
		for (int i = 0;i < bills.length; i++){
			
			int total = 5 * fiveCount + 10 * tenCount + 20 * twentyCount;
			
			System.out.println("Bill #" + i
					+ " value is " + bills[i]
					+ ", fiveCount = " + fiveCount
					+ ", tenCount = " + tenCount 
					+ ", twentyCount = " + twentyCount
					+ ", total is " + total 
					+ ".");
			
			if (bills[i] == 5){
				fiveCount ++;
			}else if (bills[i] == 10){
				if (fiveCount > 0){
					fiveCount --;
					tenCount ++;
				}else{
					return false;
				}
			}else if (bills[i] == 20){
				if (fiveCount > 0 && tenCount > 0){
					fiveCount --;
					tenCount --;
					twentyCount ++;
				}else if (fiveCount >= 3){
					fiveCount -= 3;
					twentyCount ++;
				}else{
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			int[] bills = {5, 5, 5, 10, 20};
			int[] bills = {5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5};
//			int[] bills = {10, 10};
//			int[] bills = {5, 5, 10, 10, 20};
			
//			int i = 0;
//			for(int bill: bills){
//				System.out.println(bill + " " + i);
//				i ++;
//			}
			
			Solution_860 s860 = new Solution_860();
			System.out.println(s860.lemonadeChange(bills));
	}

}
