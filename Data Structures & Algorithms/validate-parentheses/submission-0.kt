class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        val closeToOpen = hashMapOf(')' to '(', '}' to '{', ']' to '[')
        for(c in s){
            if(c in closeToOpen){
                if(stack.isEmpty() || stack.last() != closeToOpen[c]){
                    return false
                } else{
                    stack.removeLast()
                }
            }else {
                stack.add(c)
            }
        }
        return stack.isEmpty()
    }
}
