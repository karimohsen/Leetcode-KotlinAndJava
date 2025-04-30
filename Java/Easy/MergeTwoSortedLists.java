//Problem's link : fun twoSum(nums: IntArray, target: Int): IntArray {

/*
* The approach I took here is to create a dummy head and moving pointer that will
* move depending on which value is bigger.
*/
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	ListNode prehead = new ListNode(-1);
	ListNode cur = prehead;

	while (list1 != null && list2 != null) {
		if (list1.val <= list2.val) {
			cur.next = list1;
			list1 = list1.next;
		} else {
			cur.next = list2;
			list2 = list2.next;
		}
		cur = cur.next;
	}

	cur.next = list1 == null ? list2 : list1;
	return prehead.next;
}
