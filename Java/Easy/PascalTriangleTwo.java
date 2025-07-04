import java.util.ArrayList;
import java.util.List;
//Problem's link: https://leetcode.com/problems/pascals-triangle-ii/

/*
 * How to explain this sol ? This is just a small little tweak from Pascal triangle one
 * hint: So elements at index 0 and at the end are always 1
 */
public List<Integer> getRow(int rowIndex) {
    if(rowIndex == 0)
        return List.of(1);
    if(rowIndex == 1)
        return List.of(1, 1);
    List<Integer> res = new ArrayList<>();
    List<Integer> prev = List.of(1,1);
    for (int i = 2 ; i <= rowIndex; i++){
        res = new ArrayList<>();
        for(int j = 0; j <= prev.size(); j++) {
            if(j == 0 || j == prev.size()) {
                res.add(1);
            } else {
                res.add(prev.get(j - 1) + prev.get(j));
            }
        }
        prev = res;
    }
    return res;
}