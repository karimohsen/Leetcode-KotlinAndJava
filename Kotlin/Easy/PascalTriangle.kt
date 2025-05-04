//Problem's link: https://leetcode.com/problems/pascals-triangle/

/*
 * How to explain this sol ? hm...
 * hint: So elements at index 0 and at the end are always 1,
 * I created two loops, the bigger one that will travers on the List of List, the inner one will travers and create the List of Integer
 * if i am at row 4 for example : apart from values at , 0 and 1 .. we can get the current value by checking row 3 the index before me and my index.
 */
fun generate(numRows: Int): List<List<Int>> {
    val result = mutableListOf<MutableList<Int>>()
    for(index in 0 until numRows) {
        val innerList = mutableListOf<Int>()
        for(innerListIndex in 0 .. index) {
            if(innerListIndex == 0 || innerListIndex == index) {
                innerList.add(1)
            } else {
                innerList.add(result.get(index - 1).get(innerListIndex - 1) + result.get(index - 1).get(innerListIndex))
            }
        }
        result.add(innerList)
    }
    return  result
}