//Problem's link: https://leetcode.com/problems/happy-number/

/*
* The idea here is simple:
* 1- create a set for the numbers that you had (to avoid infinite loops).
* 2- for every number get all the digits and square them and add them together
* 3- the new number is the result of step 2, keep repeating till you reach one or you cant add the number to your set(already exists).
*/

public boolean isHappy(int n) {
	int num = n;
	final Set<Integer> usedNumbers = new HashSet<>();
	while(num != 1) {
		int result = 0;
		while (num > 0) {
			int digit = num % 10;
			result += digit * digit;
			num /= 10;
		}
		num = result;
		if(!usedNumbers.add(num)) // If I saw this number before then I am just repeating, Then .. break
			break;
	}
	return num == 1;
}