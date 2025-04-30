//Problem's link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
// The idea here is to create a loop and get a substring of size from index till the needle's length
// if found a match return the index.
public int strStr(String haystack, String needle) {
	for(int i=0; i < haystack.length(); i++) {
		//Will get all the possible substrings of size needle

		if((haystack.length() - i >= needle.length()) && haystack.substring(i, i + needle.length()).equals(needle)) {
			return i;
		} else if(haystack.length() - i < needle.length()) {
			//We can only get the substring if the remaining characters in the haystack string are equal or more than the needle's string size.
			return -1;
		}
	}
	return -1;
}