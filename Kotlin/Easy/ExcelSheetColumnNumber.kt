//Problem's solving: https://leetcode.com/problems/excel-sheet-column-number/description/
/*
* This problem is close to ExcelSheetColumnTitle, Excel sheet columns are 26 base.
* So AA is 1*26 + 1, AZ is 1*26 + 26
*/
fun titleToNumber(columnTitle: String): Int {
    var result = 0
    for(char in columnTitle){
        result = result * 26 + (char - 'A' + 1)
    }
    return result
}