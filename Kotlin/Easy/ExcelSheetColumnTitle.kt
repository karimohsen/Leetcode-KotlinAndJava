// Problem's link:https://leetcode.com/problems/excel-sheet-column-title/

/*
* The idea here is that the number of Alphabets is 26, when receiving a column number ex 1,
* we always deduct one from the give number and add it to 'A' and cast it back to char.
* So in the given ex, 1-1 is 0 and adding that to A it will give A as the desired output.
*/
fun convertToTitle(columnNumber: Int): String {
    val sb = StringBuilder()
    var tempVal = columnNumber
    while (tempVal > 0 ){
        tempVal--
        sb.append(('A' + tempVal%26))
        tempVal /=26
    }
    return sb.reverse().toString()
}