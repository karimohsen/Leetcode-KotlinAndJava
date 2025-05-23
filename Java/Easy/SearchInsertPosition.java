// Problem's link : https://leetcode.com/problems/search-insert-position/
// Since array is sorted , I used binary search 
public int searchInsert(int[] nums, int target) {
	int start = 0;
	int end = nums.length - 1;
	while(start <= end) {
		int mid = start + (end - start) / 2;
		if(nums[mid] == target) {
			return mid;
		} else if(nums[mid] < target) {
			start = mid + 1;
		} else {
			end = mid - 1;
		}
	}
	return start;
}