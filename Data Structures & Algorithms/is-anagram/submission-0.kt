class Solution {
    fun isAnagram(s: String, t: String): Boolean = s.toCharArray().sortedArray().contentEquals(t.toCharArray().sortedArray())
}
