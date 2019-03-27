import java.util.ArrayList;
import java.util.List;

public class Solution_985_Sum_of_Even_Numbers_After_Queries {

//	public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
//        int[] answer = new int[queries.length];
//        for (int i=0; i<queries.length; i++) {
//        	int evenSum = 0;
//        	int val = queries[i][0];
//        	int index = queries[i][1];
//        	A[index] += val;
//        	for (int j=0; j<A.length; j++) {
//        		if (A[j]%2 == 0) {
//        			evenSum += A[j];
//        		}
//        	}
//        	answer[i] = evenSum;
//        }
//        return answer;
//    }
	
	public int[] sumEvenAfterQueries(int[] A, int[][] queries) { 
		int evenSum = 0;
        int[] answer = new int[queries.length];
        
        for (int a: A) {
        	if (a%2 == 0) {
        		evenSum += a;
        	}
        }
        
        for (int i=0; i<queries.length; i++) {
        	int val = queries[i][0];
        	int index = queries[i][1];
        	if (A[index]%2 == 0) {
        		evenSum -= A[index];
        	}
        	A[index] += val;
        	if (A[index]%2 == 0) {
        		evenSum += A[index];
        	}
        	answer[i] = evenSum;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4};
		int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
		
		Solution_985_Sum_of_Even_Numbers_After_Queries obj = new Solution_985_Sum_of_Even_Numbers_After_Queries();
		
		int[] rst = obj.sumEvenAfterQueries(A, queries);
		for (int n: rst) {
			System.out.print(n + ", ");
		}
	}

}
