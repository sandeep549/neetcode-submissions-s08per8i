class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val seen = HashSet<Int>()
        return nums.any { !seen.add(it) }
    }
}
