class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val result = mutableMapOf<String, MutableList<String>>()

        for(word in strs){
            val sortedWords = word.toCharArray().sorted().joinToString("")
            result.getOrPut(sortedWords){
                mutableListOf()
            }.add(word)
        }
        return result.values.toList()
    }
}
