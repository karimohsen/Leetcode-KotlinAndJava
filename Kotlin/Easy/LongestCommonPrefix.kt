//Problem's link: https://leetcode.com/problems/longest-common-prefix/

/* 
* The idea here is to findsmallest string in the list, since it's the smalles it -might- contains the longest common prefix 
* with other strings in the list, once you have it compare it's contents against every other string in the list to get
* the longest common prefix.
*/
fun longestCommonPrefix(strs: Array<String>): String {
    if(strs.isEmpty()) return ""
    if(strs.size == 1) {return strs[0]}
    var result = ""
    var smallestString = strs[0]
    for(stringValue in strs) {
        if(stringValue.length < smallestString.length) {
            smallestString = stringValue
        }
    }

    for((i,char) in smallestString.withIndex()) {
        for(value in strs) {
            if(value[i] != char) {
                return result
            }
        }
        result += char
    }
    return result
}