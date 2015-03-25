
public class Solution {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	if (headA == null || headB == null) return null;
        ListNode a = headA, b = headB;
        while (a != null && b != null) {
        	a = a.next;
        	b = b.next;
        }
        while (a != null) {
        	a = a.next;
        	headA = headA.next;
        }
        while (b != null) {
        	b = b.next;
        	headB = headB.next;
        }
        while (headA != headB) {
        	headA = headA.next;
        	headB = headB.next;
        }
        if (headA == null) return null;
        else return headA;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a1 = new ListNode(3);
		ListNode a = new ListNode(1);
		a.next = a1;
		ListNode b = new ListNode(2);
		getIntersectionNode(a, b);
	}
}
