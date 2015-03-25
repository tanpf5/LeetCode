
public class Solution {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	if (l1 == null) return l2;
    	if (l2 == null) return l1;
        ListNode ans = new ListNode((l1.val + l2.val) % 10);
        int count = (l1.val + l2.val) / 10;
        ListNode ll = ans;
        while (l1.next != null && l2.next != null) {
        	l1 = l1.next; 
        	l2 = l2.next;
        	ll.next = new ListNode((l1.val + l2.val + count) % 10);
        	ll = ll.next;
        	count = (l1.val + l2.val + count) / 10;
        }
        if (l1.next == null && l2.next != null) {
        	while (count != 0) {
	        	l2 = l2.next;
	        	ll.next = new ListNode(count + l2.val);
	        	ll = ll.next;
	        	count = (count + l2.val) / 10;
        	}
	        	ll.next = l2.next;
	        	return ans;
        }
        if (l2.next == null && l1.next != null) {
        	while (count != 0) {
	        	l1 = l1.next;
	        	ll.next = new ListNode(count + l1.val);
	        	ll = ll.next;
	        	count = (count + l1.val) / 10;
        	}
	        	ll.next = l1.next;
	        	return ans;
        }
        if (count != 0) ll.next = new ListNode(1);
        return ans;
    }
	
	public static void main(String[] args) {
		ListNode ll = addTwoNumbers(new ListNode(5), new ListNode(5));
		// TODO Auto-generated method stub
	}

}
