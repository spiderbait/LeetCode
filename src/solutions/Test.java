
import java.util.Date;

//回头增加负数部分
public class Test {
	public static char[] getBinReverse(int n){
		char char_n[] = Integer.toBinaryString(n).toCharArray();
		 int len = char_n.length;
	        int i = 0;
	        int j = len - 1;
	        while(i!=j){
				if(i > j){
					break;
				}
				char t = char_n[j];
				char_n[j] = char_n[i];
				char_n[i] = t;
				i++;
				j--;
			}
	        return char_n;
	}
	@SuppressWarnings("unused")
	public static void main(String args[]){
//		int a = 1;
//		int b = 2;
//		char char_a[] = getBinReverse(a);
//		char char_b[] = getBinReverse(b);
//		int len = char_a.length>char_b.length?char_a.length:char_b.length;
//		char c_a[] = new char[len];
//		char c_b[] = new char[len];
//		for(int i=0;i<c_a.length;i++){
//			c_a[i] = '0';
//			c_b[i] = '0';
//		}
//		for(int i=0;i<char_a.length;i++){
//			c_a[i] = char_a[i];
//		}
//		for(int i=0;i<char_b.length;i++){
//			c_b[i] = char_b[i];
//		}
//        System.out.println(c_a);
//        System.out.println(c_b);
//        char res[] = new char[len + 1];
//        int flag[] = new int[len + 1];
//        for(int i=0;i<flag.length;i++){
//        	flag[i] = 0;
//        }
//        for(int i=0;i<len;i++){
//        	if(c_a[i] == '0' && c_b[i] == '0'){
//        		if(flag[i] == 1){
//        			res[i] = '1';
//        		}else{
//        			res[i] = '0';
//        		}
//        	}else if(c_a[i] == '1' && c_b[i] == '1'){
//        		if(flag[i] == 1){
//        			res[i] = '1';
//        			flag[i+1] = 1;
//        		}else{
//        			res[i] = '0';
//        			flag[i+1] = 1;
//        		}
//        	}else{
//        		if(flag[i] == 1){
//        			res[i] = '0';
//        			flag[i+1] = 1;
//        		}else{
//        			res[i] = '1';
//        		}
//        	}
//        	if(flag[len] == 1){
//        		res[len] = '1';
//        	}else{
//        		res[len] = '0';
//        	}
//        }
//        System.out.println(res);
//        int res_n = 0;
//        for(int i=0;i<res.length;i++){
//        	int t = (int) (Math.pow(2, i) * (int)(res[i] - 48));
//        	System.out.println("t = "+t);
//        	res_n += t;
//        }
//        
//        System.out.println(res_n);
		Date date = new Date();
		String d = date.toString();
		System.out.println(d);
		
	}
}
