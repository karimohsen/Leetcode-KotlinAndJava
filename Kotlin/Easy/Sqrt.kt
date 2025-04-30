// problem's link : https://leetcode.com/problems/sqrtx/
/*
* The approace I took here was division rather than multplie cause i was worried about overflow.
* The idea with mulplication is create a variable name it result of value one, then: 
* you create a loop from result 1 till result * result > x , and you keep increasing result by 1
* till you get a number greater than or equal your input.
*/
fun mySqrt(x: Int): Int {
    if(x == 0)
        return 0
    var result = 1;
    while(x/result >= result){
        if(x/result == result) {
            return result
        }
        result++
    }
    return result - 1
}
