// problems link : https://leetcode.com/problems/valid-parentheses/
/*
* I used a stack to solve this problem, the idea here is that with the stack it's LIFO
* which means last in first out, so if I have ([]) and I push only the opening of a parenthes
* that means that the last element in the stack is [ so I need to make sure that it's close i.e ]
* is the first element to find and pop (remove from stack), otherwise it's invalid.
* If the stack is empty it's valid.
*/
public boolean isValid(String s) {
	//If the string size is odd then it can never be a valid parentheses , why ? 
	//Ans: (() that's a string of length 3, an odd string means that the parentheses are not even.
	//So not even worth checking.
	if(s.length()%2 != 0) return false; //If the string is not even then for sure not valid ex: [[]
	final Stack<Character> stack = new Stack<>();
	for(int i=0; i< s.length(); i++) {
		final char ch = s.charAt(i);
		if(ch == '{' || ch == '(' || ch == '[') {
			stack.push(ch);
		} else {
			if(stack.isEmpty()) {
				return false;
			}else if(ch == '}' && stack.peek() != '{') {
				return false;
			}else if(ch == ']' && stack.peek() != '[') {
				return false;
			}else if(ch == ')' && stack.peek() != '(') {
				return false;
			}
			stack.pop();
		}
	}
	return stack.isEmpty();
}