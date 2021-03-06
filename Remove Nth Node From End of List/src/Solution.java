
public class Solution {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
    	if (head == null) return head;
    	ListNode inter = new ListNode(head.val), temp = inter;
    	while (head.next != null) {
    		head = head.next;
    		inter = new ListNode(head.val); 
    		inter.next = temp;
    		temp = inter;
    	}
    	if (n == 1) inter = inter.next;
    	else {
	    	while (n > 2) {
	    		temp = temp.next;
	    		--n;
	    	}
	    	temp.next = temp.next.next;
    	}
    	if (inter == null) return inter;
    	head = new ListNode(inter.val);
    	temp = head;
    	while (inter.next != null) {
    		inter = inter.next;
    		head = new ListNode(inter.val);
    		head.next = temp;
    		temp = head;
    	}
    	return head;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1); 
		a.next = new ListNode(2);
		a.next.next = new ListNode(3);
		a.next.next.next = new ListNode(4);
		a.next.next.next.next = new ListNode(5);
		ListNode b = new ListNode(1);
		removeNthFromEnd(b, 1);
		System.out.println(a);
	}

}
