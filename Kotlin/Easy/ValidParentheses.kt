// problems link : https://leetcode.com/problems/valid-parentheses/
/*
* I used a stack to solve this problem, the idea here is that with the stack it's LIFO
* which means last in first out, so if I have ([]) and I push only the opening of a parenthes
* that means that the last element in the stack is [ so I need to make sure that it's close i.e ]
* is the first element to find and pop (remove from stack), otherwise it's invalid.
* If the stack is empty it's valid.
*/
fun isValid(s: String): Boolean {
	//If the string size is odd then it can never be a valid parentheses , why ? 
	//Ans: (() that's a string of length 3, an odd string means that the parentheses are not even.
	//So not even worth checking.
    if(s.length%2 != 0) return false
    var stack = Stack<Char>()
    for(c in s.toCharArray()) {
        when(c) {
            '[', '(', '{' -> stack.push(c)
            ']' -> {
                if(stack.isEmpty() || stack.peek() != '[') {
                    return false
                }
                stack.pop()
            }
            ')' -> {
                if(stack.isEmpty() || stack.peek() != '(') {
                    return false
                }
                stack.pop()
            }
            '}' -> {
                if(stack.isEmpty() || stack.peek() != '{') {
                    return false
                }
                stack.pop()
            }
        }
    }
    return stack.isEmpty()
}