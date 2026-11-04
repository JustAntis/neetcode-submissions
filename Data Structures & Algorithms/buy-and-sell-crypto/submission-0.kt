class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = prices[0]
        var maxProfit = 0
        for(price in prices){
            maxProfit = maxOf(price - minPrice, maxProfit)
            minPrice = minOf(price, minPrice)
        }
        return maxProfit
    }
}
