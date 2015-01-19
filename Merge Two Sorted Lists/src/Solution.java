
public class Solution {
	public static ListNode add(ListNode list, ListNode a) {
		ListNode ans = list;
		while (list.next != null) list = list.next;
		list.next = a;
		return ans;
	}
	
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = null;
        while (l1 != null || l2 != null) {
        	if (l1 == null) {
        		ans = add(ans, new ListNode(l2.val));
        		l2 = l2.next;
        		continue;
        	}
        	if (l2 == null) {
        		ans = add(ans, new ListNode(l1.val));
        		l1 = l1.next;
        		continue;
        	}
        	if (l1.val > l2.val) {
        		ans = add(ans, new ListNode(l2.val));
        		l2 = l2.next;
        	}
        	else {
        		ans = add(ans, new ListNode(l1.val));
        		l1 = l1.next;
        	}
        }
        return ans;
    }
    public static void main(String[] argr) {
    	ListNode l1 = new ListNode(3);
    	ListNode l2 = new ListNode(4);
    	l1.next = new ListNode(4);
    	l2.next = new ListNode(5);
    	ListNode ans = mergeTwoLists(l1, l2);
    }
    
}