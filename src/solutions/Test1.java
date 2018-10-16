
public class Test1 {
	public static void main(String[] args){
		int x = -7;
		int y = -12;
		int tmp = 1;
		int z = x ^ y;
		System.out.println("x = "+Integer.toBinaryString(x));
		for(int i = 0;i<32;i++){
            int tmpA = (x & tmp);
            System.out.println("tmpA = "+Integer.toBinaryString(tmpA));
            tmp = tmp << i;
            System.out.println("tmp = "+Integer.toBinaryString(tmp));
        }
	}
}
