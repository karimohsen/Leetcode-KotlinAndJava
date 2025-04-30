//Problem's link: https://leetcode.com/problems/add-binary/

/*
* That problem was a tricky one, the idea here is if 10 + 1 start from the end of the string.
* If the 1 + 0 = 1 , if 1 + 1 = 0 and we should carry to the next digit.
*/
public String addBinary(String a, String b) {
	final var result = new StringBuilder();
	int carry = 0;
	int aIndex = a.length()-1;
	int bIndex = b.length()-1;
	while(aIndex >= 0 || bIndex >= 0 || carry != 0) {
		if(aIndex >= 0) {
			carry += a.charAt(aIndex--) - '0';
		}
		if(bIndex >= 0) {
			carry += b.charAt(bIndex--) - '0';
		}
		result.append(carry % 2);
		carry = carry / 2;
	}
	return result.reverse().toString();
}