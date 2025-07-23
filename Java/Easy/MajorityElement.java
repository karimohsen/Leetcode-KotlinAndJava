//Problem's link: https://leetcode.com/problems/majority-element/description/
/*
* I created a map with every number as a key and the count as value, then I searched this map for
* a key with value greater that half the array's size.
*/
public int majorityElement(int[] nums) {
    final int targetNum = nums.length/2;
    final Map<Integer,Integer> numberToCountMap = new HashMap<>();
    for(int number : nums)
        numberToCountMap.put(number, numberToCountMap.getOrDefault(number, 0) + 1);

    return numberToCountMap.entrySet()
            .stream()
            .filter(val -> val.getValue() > targetNum)
            .findFirst()
            .get()
            .getKey();
}