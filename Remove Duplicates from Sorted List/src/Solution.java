
public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
    	if ((head == null) || (head.next == null)) return head;
        if (head.next.val == head.val){
            head.next = head.next.next;
            deleteDuplicates(head);
        }
        else head.next = deleteDuplicates(head.next);
		return head;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
