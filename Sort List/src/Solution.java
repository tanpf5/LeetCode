
public class Solution {
    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode mid = head, last = head;
        while (last.next != null && last.next.next != null) {
        	mid = mid.next;
        	last = last.next.next;
        }
        ListNode temp = mid;
        mid = mid.next;
        temp.next = null;
        head = sortList(head);
        mid = sortList(mid);
        //merge
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode l = dummy;
        while (mid != null && l != null) {
        	while (l.next != null && l.next.val < mid.val) l = l.next;
        	if (l.next == null) {
        		l.next = mid;
        		break;
        	}
        	temp = l.next;
        	l.next = mid;
        	mid = mid.next;
        	l.next.next = temp;
        	l = l.next;
        }
        return dummy.next;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(5);
		head.next = new ListNode(3);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(3);
		head.next.next.next.next.next = new ListNode(6);
		head = Solution.sortList(head);
		while (head.next != null) {
			System.out.print(head.val + "->");
			head = head.next;
		}
		System.out.println(head.val);
	}

}
