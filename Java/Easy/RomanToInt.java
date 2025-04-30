//Problem's link: https://leetcode.com/problems/roman-to-integer/

public int romanToInt(String s) {
	int result = 0;
	for(int i = s.length()-1 ; i >= 0 ; i--) {
		final var current = s.charAt(i);
		final var previous = i != s.length()-1 ? s.charAt(i+1) : current;
		switch(current) {
			case 'I':
				result += previous == 'V' || previous == 'X' ? -1: 1;
				break;
			case 'V':
				result += 5;
				break;
			case 'X':
				result += previous == 'C' || previous == 'L' ? -10: 10;
				break;
			case 'L':
				result += 50;
				break;
			case 'C':
				result += previous == 'D' || previous == 'M' ? -100: 100;
				break;
			case 'D':
				result += 500;
				break;
			case 'M':
				result += 1000;
				break;
		}
	}

	return result;
}