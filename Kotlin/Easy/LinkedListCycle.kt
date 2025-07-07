//Problem's solving: https://leetcode.com/problems/linked-list-cycle/description/
/*
* I created a set to keep track of the visited address and I check if the address exists in my set
*/
fun hasCycle(head: ListNode?): Boolean {
    var current = head
    //This set will carry the addresses of the visited nodes, I have used set cause .contains is O(1).
    val nodeAddress = mutableSetOf<ListNode>()
    while (current != null){
        if(nodeAddress.contains(current))
            return true
        nodeAddress.add(current)
        current = current.next
    }
    return false
}
