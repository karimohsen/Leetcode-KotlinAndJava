//Problem's link : fun twoSum(nums: IntArray, target: Int): IntArray {

/*
* The approach I took here is to create a dummy head and moving pointer that will
* move depending on which value is bigger.
*/
fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    var firstList = list1
    var secondList = list2
    val preHead = ListNode(-1)
    var current = preHead
    while(firstList != null && secondList != null) {
        if(firstList.`val`  < secondList.`val`) {
            current.next = firstList
            firstList = firstList.next
        } else {
            current.next = secondList
            secondList = secondList.next
        }
        current = current.next!!
    }
    current.next = if(firstList == null) secondList else firstList

    return preHead.next
}
