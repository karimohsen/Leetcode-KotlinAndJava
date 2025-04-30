//Problem's link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/

/*
* 1- Create a moving pointer that points to the head.
* 2- Skip next if duplicate that means current.next == current.next.next , otherwise don't skip.
*/
public ListNode deleteDuplicates(ListNode head) {
	ListNode current = head;
	while(current != null && current.next != null) {
		if(current.val == current.next.val) {
			current.next = current.next.next;
		}
		current = current.next;
	}
	return head;
}
