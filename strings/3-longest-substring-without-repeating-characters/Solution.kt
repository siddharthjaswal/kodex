fun main() {
    println("🧠 3. Longest Substring Without Repeating Characters")
    println("=" * 50)
    
    val solution = Solution()
    
    // Test Example 1
    val s1 = "abcabcbb"
    val result1 = solution.lengthOfLongestSubstring(s1)
    println("Example 1:")
    println("Input: s = \"$s1\"")
    println("Output: $result1 (Expected: 3)")
    println("Explanation: The answer is \"abc\", with the length of 3.")
    println("✅ ${if (result1 == 3) "PASS" else "FAIL"}")
    println()
    
    // Test Example 2
    val s2 = "bbbbb"
    val result2 = solution.lengthOfLongestSubstring(s2)
    println("Example 2:")
    println("Input: s = \"$s2\"")
    println("Output: $result2 (Expected: 1)")
    println("Explanation: The answer is \"b\", with the length of 1.")
    println("✅ ${if (result2 == 1) "PASS" else "FAIL"}")
    println()
    
    // Test Example 3
    val s3 = "pwwkew"
    val result3 = solution.lengthOfLongestSubstring(s3)
    println("Example 3:")
    println("Input: s = \"$s3\"")
    println("Output: $result3 (Expected: 3)")
    println("Explanation: The answer is \"wke\", with the length of 3.")
    println("✅ ${if (result3 == 3) "PASS" else "FAIL"}")
    println()
    
    // Edge Cases
    val s4 = ""
    val result4 = solution.lengthOfLongestSubstring(s4)
    println("Edge Case 1 - Empty String:")
    println("Input: s = \"$s4\"")
    println("Output: $result4 (Expected: 0)")
    println("✅ ${if (result4 == 0) "PASS" else "FAIL"}")
    println()
    
    val s5 = "a"
    val result5 = solution.lengthOfLongestSubstring(s5)
    println("Edge Case 2 - Single Character:")
    println("Input: s = \"$s5\"")
    println("Output: $result5 (Expected: 1)")
    println("✅ ${if (result5 == 1) "PASS" else "FAIL"}")
    println()
    
    val s6 = "abcdef"
    val result6 = solution.lengthOfLongestSubstring(s6)
    println("Edge Case 3 - All Unique:")
    println("Input: s = \"$s6\"")
    println("Output: $result6 (Expected: 6)")
    println("✅ ${if (result6 == 6) "PASS" else "FAIL"}")
    println()
    
    println("=" * 50)
    println("🎯 Implementation ready for your solution!")
}

class Solution {
    /**
     * 3. Longest Substring Without Repeating Characters
     * 
     * TODO: Implement your solution here!
     * 
     * Approaches to consider:
     * 1. Brute Force - O(n³) time
     * 2. Sliding Window with Set - O(n) time
     * 3. Optimized Sliding Window with Map - O(n) time
     * 
     * Tips:
     * - Think about using sliding window technique
     * - Consider using HashSet or HashMap for character tracking
     * - Remember to handle edge cases (empty string, single char, etc.)
     * 
     * @param s: String to find longest substring without repeating characters
     * @return: Length of the longest substring without repeating characters
     */
    fun lengthOfLongestSubstring(s: String): Int {
        // TODO: Your implementation goes here
        
        // Placeholder return - replace with your solution
        return 0
    }
}

// Helper extension function for cleaner output
operator fun String.times(n: Int): String = this.repeat(n)