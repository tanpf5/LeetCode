
public class Solution {
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode new_head = new ListNode(0);
        new_head.next = head;
        ListNode head_copy = new_head;
        ListNode first = null, end = null, front = null; 
        int i = 0;
        while (i <= n) {
        	if (i == m - 1) front = head_copy;
        	if (i == m) first = head_copy;
        	if (i == n) end = head_copy;
        	++i;
        	head_copy = head_copy.next;
        }
        front.next = end;
        ListNode second = first.next;
        first.next = head_copy;
        while (second != head_copy) {
        	ListNode third = second.next;
        	second.next = first;
        	first = second;
        	second = third;
        }
        return new_head.next;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		ListNode ans = Solution.reverseBetween(head, 1, 5);
		while (ans.next != null) {
			System.out.print(ans.val + "->");
			ans = ans.next;
		}
		System.out.println(ans.val);
	}

}
