class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val set = nums.toSet()
        var max = 0

        for(num in set) {
            if((num-1) !in set) {
                var len = 1
                while((num + len) in set) {
                    len++
                }
                max = maxOf(max, len)
            }
        }

        return max
    }
}
