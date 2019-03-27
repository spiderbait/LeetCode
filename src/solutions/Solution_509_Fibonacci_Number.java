public class Solution_509_Fibonacci_Number {
	
	public int fib(int N) {
		if(N == 0) {
			return 0;
		}else if(N == 1) {
			return 1;
		}else {
			return fib(N - 1) + fib(N - 2);
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution_509_Fibonacci_Number obj = new Solution_509_Fibonacci_Number();
		System.out.print(obj.fib(8));
	}

}