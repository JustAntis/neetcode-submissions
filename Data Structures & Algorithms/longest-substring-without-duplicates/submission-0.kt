class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val chars = HashSet<Char>()
        var left = 0
        var max = 0
        for (right in s.indices) {
            while (chars.contains(s[right])) {
                chars.remove(s[left])
                left++
            }
            chars.add(s[right])
            val currMax = (right - left) + 1
            if(currMax > max){
                max = currMax
            } 
        }
        return max
    }
}
