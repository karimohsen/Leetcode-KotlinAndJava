
//Problem's link: https://leetcode.com/problems/pascals-triangle-ii/

/*
 * How to explain this sol ? This is just a small little tweak from Pascal triangle one
 * hint: So elements at index 0 and at the end are always 1
 */

fun getRow(rowIndex: Int): List<Int> {
    if(rowIndex == 0)
        return listOf(1)
    if(rowIndex == 1)
        return listOf(1,1)
    var res = mutableListOf<Int>()
    var prev = mutableListOf(1,1)
    for (i in 2 .. rowIndex){
        res = mutableListOf<Int>()
        for (j in 0 .. prev.size) {
            if(j == 0 || j == prev.size) {
                res.add(1)
            } else {
                res.add(prev.get(j-1) + prev.get(j))
            }
        }
        prev = res
    }
    return res
}