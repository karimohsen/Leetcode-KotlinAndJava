//Problem's link: https://leetcode.com/problems/length-of-last-word/

//Idea: Start counting when you find a non space char, once you find a space return the count. 
public int lengthOfLastWord(String s) {
	int size = 0;
	final var trimedString = s.trim();
	for(int i=trimedString.length()-1; i>=0; i--) {
		if(trimedString.charAt(i) == ' ') {
			return size;
		} else {
			size++;
		}
	}

	return size;
}