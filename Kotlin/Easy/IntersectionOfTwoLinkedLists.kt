// Problem's link : https://leetcode.com/problems/intersection-of-two-linked-lists/description/
// The idea here is to save the addresses of one of the linked list in a set, loop on the other and whilst looping
//check if you have this entry in your set.
fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
    if(headA == null || headB == null)
        return null
    var headAVisitor = headA
    val visitedNodes = mutableSetOf<ListNode>()
    while (headAVisitor != null){
        visitedNodes.add(headAVisitor)
        headAVisitor = headAVisitor.next
    }

    var headBVisitor = headB
    while (headBVisitor != null){
        if(visitedNodes.contains(headBVisitor))
            return headBVisitor
        headBVisitor = headBVisitor.next
    }
    return null
}