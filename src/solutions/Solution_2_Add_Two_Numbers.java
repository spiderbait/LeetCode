// rst精度问题加油加油加油


public class Solution_2_Add_Two_Numbers {
	
	public ListNode arrayToLinkList(int[] nums){
		
		ListNode head = new ListNode(nums[0]);
		ListNode p = head;
		for(int i=1; i < nums.length; i++){
			p.next = new ListNode(nums[i]);
			p = p.next;
		}
		
		return head;
	}
	
	public void printLinkList(ListNode head){
		
		ListNode p = head;
		
		while(p != null){
			if(p.next == null){
				System.out.print(p.val);
			}else{
				System.out.print(p.val + " --> ");
			}
			p = p.next;
		}
		System.out.println();
	}
	
	public long linkToInt(ListNode head){
		
		ListNode p = head;
		long rst = 0;
		long multiplier = 1;
		
		while(p != null){
			
			rst += p.val * multiplier;
			System.out.println("p.val = " + p.val + ", multiplier = " + multiplier + ", rst = " + rst);
			multiplier *= 10;
	       	p = p.next;
	       
		}
		
		return rst;
	}
	
	public ListNode intToLink(long n){
		
		
		String nStr = Long.toString(n);
//		System.out.println("n = " + n + ", nStr = " + nStr);
		
		ListNode p = new ListNode((int)(nStr.charAt(0) - '0'));		//char型转到int型，ASCII码减
//		System.out.println("nStr.charAt(0) = " + nStr.charAt(0) + ", p.val = " + p.val);
		ListNode rst = p;
		
		for (int i=1; i < nStr.length(); i++){

			rst = new ListNode((int)((nStr.charAt(i) - '0')));
			rst.next = p;
			p = rst;
		}
		
		return rst;
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode p1 = l1;
        ListNode p2 = l2;
        
         
        long sum = linkToInt(p1) + linkToInt(p2);
        ListNode rst = intToLink(sum);
        
        return rst;
    }
	
	public static void main(String args[]){
		
		
		Solution_2_Add_Two_Numbers sol = new Solution_2_Add_Two_Numbers();
//		sol.printLinkList(sol.addTwoNumbers(l1, l2));
		
//		System.out.println(sol.linkToInt(l2));
//		sol.printLinkList(sol.intToLink(sol.linkToInt(l2)));
		
//		int[] n1 = {9};
//		int[] n2 = {1,9,9,9,9,9,9,9,9,9};
//		
//		int[] l1 = {2,4,3};
//		int[] l2 = {5,6,4};
//		
//		sol.printLinkList(sol.arrayToLinkList(n1));
//		sol.printLinkList(sol.arrayToLinkList(n2));
//		System.out.println(sol.linkToInt(sol.arrayToLinkList(n1)));
//		System.out.println(sol.linkToInt(sol.arrayToLinkList(n2)));
//		
//		sol.printLinkList(sol.addTwoNumbers(sol.arrayToLinkList(n1), sol.arrayToLinkList(n2)));
		
		int[] s1 = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
		int[] s2 = {5,6,4};
		
		System.out.println(sol.linkToInt(sol.arrayToLinkList(s1)));
		System.out.println(sol.linkToInt(sol.arrayToLinkList(s2)));
		sol.printLinkList(sol.addTwoNumbers(sol.arrayToLinkList(s1), sol.arrayToLinkList(s2)));
		
//		
//		
//		sol.printLinkList(sol.arrayToLinkList(l1));
//		sol.printLinkList(sol.arrayToLinkList(l2));
//		System.out.println(sol.linkToInt(sol.arrayToLinkList(l1)));
//		System.out.println(sol.linkToInt(sol.arrayToLinkList(l2)));
//		
//		sol.printLinkList(sol.addTwoNumbers(sol.arrayToLinkList(l1), sol.arrayToLinkList(l2)));
		
//		int n = 9999999991L;
//		sol.printLinkList(sol.intToLink(n));
		
		
		
	}
}
