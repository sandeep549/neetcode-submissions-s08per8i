class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val preMap = HashMap<Int, Int>()

        for((i, n) in nums.withIndex()) {
            val diff = target - n
            if(preMap.containsKey(diff)) {
                return intArrayOf(preMap[diff]!!, i)
            }
            preMap[n] = i
        }
        return intArrayOf()
    }
}
