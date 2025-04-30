//Problem's link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
// The idea here is to create a loop and get a substring of size from index till the needle's length
// if found a match return the index.
fun strStr(haystack: String, needle: String): Int {
    for(index in haystack.indices) {
        if((haystack.length - index >= needle.length) && haystack.substring(index, index + needle.length) == needle) {
            return index
        } else if(haystack.length - index < needle.length) {
            return -1
        }
    }
    return -1
}