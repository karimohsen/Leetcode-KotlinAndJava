//Problem's link: https://leetcode.com/problems/longest-common-prefix/

/* 
* The idea here is to findsmallest string in the list, since it's the smalles it -might- contains the longest common prefix 
* with other strings in the list, once you have it compare it's contents against every other string in the list to get
* the longest common prefix.
*/
public String longestCommonPrefix(String[] strs) {
	if(strs == null || strs.length == 0) return "";
	String samllestStr = strs[0];
	for(int i=0; i< strs.length; i++) {
		if(strs[i].length() < samllestStr.length()) {
			samllestStr = strs[i];
		}
	}
	final StringBuilder longestPrefix = new StringBuilder("");
	for(int i=0; i< samllestStr.length(); i++) {
		for(int j=0; j< strs.length; j++) {
			if(samllestStr.charAt(i) != strs[j].charAt(i)) {
			   return longestPrefix.toString();
			}
		}
		longestPrefix.append(samllestStr.charAt(i));
	}
	return longestPrefix.toString();
}