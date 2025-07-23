//Problem's solving: https://leetcode.com/problems/excel-sheet-column-number/description/
/*
* This problem is close to ExcelSheetColumnTitle, Excel sheet columns are 26 base.
* So AA is 1*26 + 1, AZ is 1*26 + 26
*/
public int titleToNumber(String columnTitle) {
	int result = 0;
	for(int i = 0; i < columnTitle.length(); i++){
		char c = columnTitle.charAt(i);
		//It processes one character at a time from left to right,
		//and it updates the current number as if we’re building a base-26 number.
		result = result * 26 + (c - 'A' + 1);
	}
	return result;
}