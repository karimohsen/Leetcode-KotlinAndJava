//Problem's solving: https://leetcode.com/problems/climbing-stairs/
/*
* This problem is really fun, if the input is 1 the output is 1
* if the input is 2 the output is 2
* if the input is 3 the output is 3
* if the input is 4 the output is 5
* if the input is 5 the output is 8
* That's a just fibonacci sequence in disguise!!
*/
public int climbStairs(int n) {
	int result = 0;
	int firstNum = 0;
	int secondNum = 1;
	while(n > 0) {
		result = firstNum + secondNum;
		firstNum = secondNum;
		secondNum = result;
		n--;
	}
	return result;
}