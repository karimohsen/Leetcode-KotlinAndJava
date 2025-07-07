//Problem's solving: https://leetcode.com/problems/linked-list-cycle/description/
/*
* I created a set to keep track of the visited address and I check if the address exists in my set
*/
public boolean hasCycle(ListNode head) {
	//This set will carry the addresses of the visited nodes, I have used set cause .contains is O(1).
	final Set<ListNode> visitedNodes = new HashSet<>();
	ListNode current = head;
	while (current != null){
		if (visitedNodes.contains(current))
			return true;
		visitedNodes.add(current);
		current = current.next;
	}
	return false;
}