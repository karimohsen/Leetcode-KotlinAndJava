//Problem's solving: https://leetcode.com/problems/valid-palindrome/description/
/*
* Create two pointers, one in the beginning of the str and the other at the end,move a pointer if it is not an alphanumeric
* (we want to skip any non-alphanumeric character), if both pointers are pointing at an alphanumeric then they need to match
* otherwise it is not a palindrome.
*/
public boolean isPalindrome(String s) {
	int i = 0;
	int j = s.length() - 1;
	while(i < j){
		char firstChar = s.charAt(i);
		char secondChar = s.charAt(j);
		if(!Character.isAlphabetic(firstChar) && !Character.isDigit(firstChar)){
			i++;
			continue;
		} if(!Character.isAlphabetic(secondChar) && !Character.isDigit(secondChar)){
			j--;
			continue;
		} else if(Character.toLowerCase(firstChar) != Character.toLowerCase(secondChar)){
			return false;
		}
		i++;
		j--;
	}
	return true;
}