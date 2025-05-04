//Problem's link: https://leetcode.com/problems/pascals-triangle/

/*
 * How to explain this sol ? hm...
 * hint: So elements at index 0 and at the end are always 1,
 * I created two loops, the bigger one that will travers on the List of List, the inner one will travers and create the List of Integer
 * if i am at row 4 for example : apart from values at , 0 and 1 .. we can get the current value by checking row 3 the index before me and my index.
 */
public  List<List<Integer>> generate(int numRows) {
    final List<List<Integer>> result = new ArrayList<>();
    for(int i = 0 ; i < numRows ; i++) {
        final List<Integer> internalRow = new ArrayList<>();
        for(int j = 0 ; j <= i; j++) {
            if(j == 0 || j == i) {
                internalRow.add(1);
            } else {
                internalRow.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
        }
        result.add(internalRow);
    }
    return result;
}