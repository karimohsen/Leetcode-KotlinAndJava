//Problem's link: https://leetcode.com/problems/merge-sorted-array/description/

/*
* The approach I took here is to start from the end of the two arrays and add at the end as well
*/

public void merge(int[] nums1, int m, int[] nums2, int n) {
	int tailNums1 = m-1, tailNums2 = n-1, count = (n+m)-1;
	while(tailNums1 >= 0 && tailNums2 >= 0) {
		nums1[count--] = nums1[tailNums1] > nums2[tailNums2] ? nums1[tailNums1--]: nums2[tailNums2--];
	}
	while(tailNums2 >= 0)
		nums1[count--] = nums2[tailNums2--];
}


