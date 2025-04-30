// Problem's link:https://leetcode.com/problems/plus-one/ 

/*
* The idea here is if the number is less than 9 we can just increment and return the array ex: 877 -> 878
* if it's 9 then it needs to be 0 ex: 89 -> 90
* what if it's 99 ? in that case will be 00 then at the end will create a new array of size +1 the orriginal and set 
* 1 at index 0.
*/
public int[] plusOne(int[] digits) {
   for(int i = digits.length-1; i>=0; i--) {
	   if(digits[i] != 9) {
		   digits[i]++;
		   return digits;
	   }
	   digits[i] = 0;
   }
   digits = new int[digits.length+1];
   digits[0] = 1;
   return digits;
}