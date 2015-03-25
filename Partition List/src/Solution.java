
public class Solution {
	public static ListNode partition(ListNode head, int x) {
		if (head == null) return null;
		ListNode smaller = new ListNode(0);
		ListNode smaller2 = smaller;
		ListNode other = new ListNode(0);
		ListNode other2 = other;
		while (head != null) {
			if (head.val < x) {
				smaller2.next = new ListNode(head.val);
				smaller2 = smaller2.next;
			}
			else {
				other2.next = new ListNode(head.val);
				other2 = other2.next;
			}
			head = head.next;
		}
		smaller2.next = other.next;
		return smaller.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(4);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(2);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(2);
		ListNode ans = Solution.partition(head, 3);
		while (ans.next != null) {
			System.out.print(ans.val + "->");
			ans = ans.next;
		}
		System.out.println(ans.val);
	}

}
