
public class Solution {
/*    public static void reorderList(ListNode head) {
    	if (head == null) return;
        ListNode head1 = head;
        while (head1.next != null && head1.next.next != null) {
        	ListNode tail = head1;
        	while (tail.next.next != null) tail = tail.next;
        	ListNode tail2 = tail.next;
        	tail.next = null;
        	tail2.next = head1.next;
        	head1.next = tail2;
        	head1 = head1.next.next;
        }
    }*/
	public static void reorderList(ListNode head) {
    	if (head == null || head.next == null || head.next.next == null) return;
    	ListNode dummy = head;
    	ListNode reverse = head;
    	int n = 0;
    	while (dummy != null) {
    		dummy = dummy.next;
    		++n;
    	}
    	for (int i = 0; i < (n - 1) / 2; i++)
    		reverse = reverse.next;
    	ListNode start = reverse.next, then = start.next;
    	while (then != null) {
    		start.next = then.next;
    		then.next = reverse.next;
    		reverse.next = then;
    		then = start.next;
    	}
    	dummy = head;
    	ListNode temp = reverse.next;
    	reverse.next = null;
    	reverse = temp;
    	for (int i = 0; i < n / 2; i++) {
    		temp = dummy.next;
    		dummy.next = reverse;
    		reverse = reverse.next;
    		dummy.next.next = temp;
    		dummy = temp;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
//		head.next.next.next = new ListNode(4);
	//	head.next.next.next.next = new ListNode(5);
		//head.next.next.next.next.next = new ListNode(6);
		Solution.reorderList(head);
		while (head.next != null) {
			System.out.print(head.val + "->");
			head = head.next;
		}
		System.out.println(head.val);
	}

}
