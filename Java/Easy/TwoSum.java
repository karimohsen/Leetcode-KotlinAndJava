import java.util.*
//Problem link: https://leetcode.com/problems/two-sum/
/*
* The approach i took is to create a map where the value is the key and the index is the value,
* since every value is unique. 
* If the (target - value) exists in the map then return the index of the value and the
* other value of the key (target - value).
*/
public int[] twoSum(int[] nums, int target) {
	final Map<Integer, Integer> map = new HashMap<>();
	for(int i=0; i< nums.length; i++) {
		map.put(nums[i], i);
	}

	for(int i=0; i< nums.length; i++) {
		if(map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
			return new int[]{i, map.get(target - nums[i])};
		}
	}
	return null;
}