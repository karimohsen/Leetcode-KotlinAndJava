//Problem's link: https://leetcode.com/problems/roman-to-integer/

fun romanToInt(s: String): Int {
    var res = 0
    for(index in s.indices.reversed()) {
        val current = s[index]
        val previous = if(index != s.length -1) s[index + 1] else current
        when(current) {
            'I' -> res += if(previous == 'V' || previous == 'X') -1 else 1
            'V' -> res += 5
            'X' -> res += if(previous == 'L' || previous == 'C') -10 else 10
            'L' -> res += 50
            'C' -> res += if(previous == 'D' || previous == 'M') -100 else 100
            'D' -> res += 500
            'M' -> res += 1000
        }
    }
    return res
}