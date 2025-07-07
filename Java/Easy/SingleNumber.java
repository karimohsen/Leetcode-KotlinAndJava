//Problem's solving: https://leetcode.com/problems/single-number/description/
/*
* This is straight forward, I created a map for the number and the count of occurrence, I return
* the number that has only one occurrence since it is guaranteed.
*/
public int singleNumber(int[] nums) {
	final Map<Integer, Integer> map = new HashMap<>();
	for (int num : nums) {
		map.put(num, map.getOrDefault(num, 0) + 1);
	}

	return map.entrySet()
			.stream()
			.filter(entry -> entry.getValue() == 1)
			.findFirst()
			.get()
			.getKey();
}