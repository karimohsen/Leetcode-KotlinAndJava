//Problem's link: https://leetcode.com/problems/add-binary/

/*
* That problem was a tricky one, the idea here is if 10 + 1 start from the end of the string.
* If the 1 + 0 = 1 , if 1 + 1 = 0 and we should carry to the next digit.
*/
fun addBinary(a: String, b: String): String {
    var result = ""
    var carry = 0
    var aIndex = a.length -1
    var bIndex = b.length-1
    while(aIndex >= 0 || bIndex >= 0 || carry != 0) {
        if(aIndex >= 0) {
            carry += a[aIndex--] - '0'
        }
        if(bIndex >= 0) {
            carry += b[bIndex--] - '0'
        }
        result += carry % 2
        carry /= 2
    }
    return result.reversed()
}