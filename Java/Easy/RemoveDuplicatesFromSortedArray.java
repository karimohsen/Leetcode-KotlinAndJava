//Problem's link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

/*
* We have to change the values inside the array, so create a counter 
* and only update if the previous is not the same as current.
*/
public int removeDuplicates(int[] nums) {
	int count = 1;
	for(int i=1; i<nums.length; i++) {
		if(nums[i] != nums[i-1]) {
			nums[count] = nums[i];
			count++;
		}
	}
	return count;
}