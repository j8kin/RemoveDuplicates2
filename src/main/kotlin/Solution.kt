class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var j = 1
        var second = false
        for (i in 1..<nums.size) {
            if (nums[i] != nums[i-1]) {
                nums[j++] = nums[i]
                second = false
            }
            else {
                if (!second) {
                    nums[j++] = nums[i]
                    second = true
                }
            }
        }
        return j
    }
}