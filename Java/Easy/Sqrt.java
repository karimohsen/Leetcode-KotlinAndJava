// problem's link : https://leetcode.com/problems/sqrtx/
/*
* The approace I took here was division rather than multplie cause i was worried about overflow.
* The idea with mulplication is create a variable name it result of value one, then: 
* you create a loop from result 1 till result * result > x , and you keep increasing result by 1
* till you get a number greater than or equal your input.
*/
public int mySqrt(int x) {
	if(x  == 0)
		return 0;
	int i=1;
	for(;i<=x/i;i++) { //using division instead of multiplication to avoid integer overflow
		if(x/i==i){
			return i;
		}  
	}
	return i-1; //returning (i-1) because at some point (i*i) became greater than x and loop stopped!!!
}
