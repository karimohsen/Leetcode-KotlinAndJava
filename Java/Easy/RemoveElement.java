//Problem's link: https://leetcode.com/problems/remove-element/
/*
* The idea here is to remove in place, cause it is required that you change the given array.
* So create a new index and only increment and set value if not equal the val passed.
*/
public int removeElement(int[] nums, int val) {
	int count = 0;
	for(int i=0; i<nums.length; i++) {
		if(nums[i] != val) {
			nums[count] = nums[i];
			count++;
		}
	}
	return count;
}