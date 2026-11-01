class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var result = ""
        val first = strs[0]
        for (i in first.indices) {
            val c = first[i]
                for (s in strs) {
                    if (i >= s.length || s[i] != c) return result
                }
            result += c
        }          
        return result
    }
}
