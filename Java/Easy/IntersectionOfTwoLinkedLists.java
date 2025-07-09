// Problem's link : https://leetcode.com/problems/intersection-of-two-linked-lists/description/
// The idea here is to save the addresses of one of the linked list in a set, loop on the other and whilst looping
//check if you have this entry in your set.
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	if(headA == null || headB == null)
		return null;
	final Set<ListNode> visitedNodeAddress = new HashSet<>();
	ListNode headAVisitor = headA;
	while (headAVisitor!= null){
		visitedNodeAddress.add(headAVisitor);
		headAVisitor = headAVisitor.next;
	}
	ListNode headBVisitor = headB;
	while (headBVisitor!= null){
		if(visitedNodeAddress.contains(headBVisitor))
			return headBVisitor;
		headBVisitor = headBVisitor.next;
	}
	return null;
}