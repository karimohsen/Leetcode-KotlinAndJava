//Problem's link: https://leetcode.com/problems/length-of-last-word/

//Idea: Start counting when you find a non space char, once you find a space return the count. 
fun lengthOfLastWord(s: String): Int {
    var size = 0
    for(char in s.reversed()) {
        if(char != ' ') {
            size++
        } else if(size != 0) {
            return size
        }
    }
    return size
}