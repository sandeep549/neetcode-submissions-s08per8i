class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        nums.sort()

        for(i in nums.indices) {
            val a = nums[i]
            if(a > 0) break // all number are positive
            if(i > 0 && nums[i] == nums[i-1]) continue
             var l = i + 1
             var r = nums.size - 1
             while(l < r) {
                val sum = a + nums[l] + nums[r]
                when {
                    sum > 0 -> r--
                    sum < 0 -> l++
                    else -> {
                        res.add(listOf(a, nums[l], nums[r]))
                        l++
                        r--
                        while(l < r && nums[l] == nums[l-1]) {
                            l++
                        }
                    }
                }
             }
        }
        return res
    }
}
