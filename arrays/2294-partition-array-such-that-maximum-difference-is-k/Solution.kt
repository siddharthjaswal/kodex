fun main() {
    println("\n\n\n 🚀 Testing 🚀")
    println("=" * 40)
    
    val solution = Solution()
    
    // Test Example 1
    val nums1 = intArrayOf(3, 6, 1, 2, 5)
    val k1 = 2
    val result1 = solution.partitionArray(nums1, k1)
    println("Example 1:")
    println("Input: nums = ${nums1.contentToString()}, k = $k1")
    println("Output: $result1 (Expected: 2)")
    println("✅ ${if (result1 == 2) "PASS" else "FAIL"}")
    println()
    
    // Test Example 2
    val nums2 = intArrayOf(1, 2, 3)
    val k2 = 1
    val result2 = solution.partitionArray(nums2, k2)
    println("Example 2:")
    println("Input: nums = ${nums2.contentToString()}, k = $k2")
    println("Output: $result2 (Expected: 2)")
    println("✅ ${if (result2 == 2) "PASS" else "FAIL"}")
    println()
    
    // Test Example 3
    val nums3 = intArrayOf(2, 2, 4, 5)
    val k3 = 0
    val result3 = solution.partitionArray(nums3, k3)
    println("Example 3:")
    println("Input: nums = ${nums3.contentToString()}, k = $k3")
    println("Output: $result3 (Expected: 3)")
    println("✅ ${if (result3 == 3) "PASS" else "FAIL"}")
    println()
    
    println("=" * 40)
    println("🎯 Setup test complete!")
}

class Solution {
    /**
     * 2294. Partition Array Such That Maximum Difference Is K
     * 
     * Approach: Greedy with Sorting
     * 1. Sort the array to group similar elements together
     * 2. Use greedy approach: start a new subsequence when difference > k
     * 
     * Time Complexity: O(n log n) - due to sorting
     * Space Complexity: O(1) - only using constant extra space
     */
    fun partitionArray(nums: IntArray, k: Int): Int {
        // Sort the array to make greedy approach work
        nums.sort()
        
        var subsequences = 1 // At least one subsequence needed
        var minInCurrentSubseq = nums[0]
        
        // Iterate through sorted array
        for (i in 1 until nums.size) {
            // If difference exceeds k, start a new subsequence
            if (nums[i] - minInCurrentSubseq > k) {
                subsequences++
                minInCurrentSubseq = nums[i]
            }
        }
        
        return subsequences
    }
}

// Helper extension function for cleaner output
operator fun String.times(n: Int): String = this.repeat(n)