// Problem's link:https://leetcode.com/problems/excel-sheet-column-title/

/*
* The idea here is that the number of Alphabets is 26, when receiving a column number ex 1,
* we always deduct one from the give number and add it to 'A' and cast it back to char.
* So in the given ex, 1-1 is 0 and adding that to A it will give A as the desired output.
*/
public String convertToTitle(int columnNumber) {
    final StringBuilder res = new StringBuilder();
    while (columnNumber > 0) {
        columnNumber--;
        res.append((char) ((columnNumber % 26) + 'A'));
        columnNumber /= 26;
    }

    return res.reverse().toString();
}