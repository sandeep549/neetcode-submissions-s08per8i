class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val res = IntArray(n)
        val pre = IntArray(n)

        pre[n-1] = nums[n-1]
        for(i in n-2 downTo 0) {
            pre[i] = pre[i+1] * nums[i]
        }

        var leftProduct = 1
        for(i in 0 until n) {
            if (i < n - 1) {
                res[i] = leftProduct * pre[i+1]
            } else {
                res[i] = leftProduct
            }
            leftProduct *= nums[i]
        } 

        return res
    }
}
