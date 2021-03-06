
public class Solution {
    public static ListNode rotateRight(ListNode head, int k) {
    	if (head == null || k == 0) return head;
    	ListNode dummy = head;
    	int n = 0;
    	while (dummy != null) {
    		++n;
    		dummy = dummy.next;
    	}
        ListNode pointer1 = head, pointer2 = head;
        for (int i = 0; i < k % n; i++) {
        	pointer2 = pointer2.next;
        }
        if (pointer2 == null) return head;
        while (pointer2.next != null) {
        	pointer2 = pointer2.next;
        	pointer1 = pointer1.next;
        }
        pointer2.next = head;
        head = pointer1.next;
        pointer1.next = null;
        return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
//		head.next.next = new ListNode(3);
//		head.next.next.next = new ListNode(4);
//		head.next.next.next.next = new ListNode(5);
		head = Solution.rotateRight(head, 3);
		while (head.next != null) {
			System.out.print(head.val + "->");
			head = head.next;
		}
		System.out.println(head.val);
	}

}
