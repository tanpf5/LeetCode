
public class Solution {
    public static ListNode insertionSortList(ListNode head) {
    	if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        while (head.next != null) {
        	ListNode head2 = dummy;
        	while (head2.next != null && head2.next.val < head.next.val && head2.next != head.next)
        		head2 = head2.next;
        	if (head2.next == head.next) {
        		head = head.next;
        		continue;
        	}
        	ListNode temp = head.next;
        	head.next = head.next.next;
        	temp.next = head2.next;
        	head2.next = temp;
        }
        return dummy.next;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(3);
		head.next = new ListNode(1);
		head.next.next = new ListNode(9);
		head.next.next.next = new ListNode(2);
		head.next.next.next.next = new ListNode(7);
		head.next.next.next.next.next = new ListNode(3);
		head.next.next.next.next.next.next = new ListNode(4);
		head = Solution.insertionSortList(head);
		while (head.next != null) {
			System.out.print(head.val + "->");
			head = head.next;
		}
		System.out.println(head.val);
	}

}
