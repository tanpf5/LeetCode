
public class Solution {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = new ListNode(0), first = head, second = head.next;
        pre.next = head;
        head = pre;
        while (second != null) {
        	boolean b = false;
        	while (second != null && first.val == second.val) {
        		first.next = second.next;
        		second = second.next;
        		b = true;
        	}        	
        	if (b) {
        		first = second;           		
        		pre.next = first;
        		if (second != null) 
        			second = second.next;
        	}       	
        	else {
	        	pre = first;
	        	first = second;
	        	second = second.next;
        	}
        }
        return head.next;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(3);
		head.next.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next.next = new ListNode(4);
		head = Solution.deleteDuplicates(head);
		if (head == null) { 
			System.out.println(); return;
		}
		while (head.next != null) {
			System.out.print(head.val + "->");
			head = head.next;
		}
		System.out.println(head.val);
	}

}
