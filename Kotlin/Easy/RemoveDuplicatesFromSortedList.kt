//Problem's link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/

/*
* 1- Create a moving pointer that points to the head.
* 2- Skip next if duplicate that means current.next == current.next.next , otherwise don't skip.
*/
fun deleteDuplicates(head: ListNode?): ListNode? {
    var current: ListNode? = head
    while(current?.next != null) {
        if(current.`val` == current.next?.`val`) {
            current.next = current.next?.next
        } else {
            current = current.next
        }
    }
    return head
}
