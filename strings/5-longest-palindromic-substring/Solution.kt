fun main() {
    println("🔄 5. Longest Palindromic Substring")
    println("=" * 45)
    
    val solution = Solution()
    
    // Test Example 1
    val s1 = "babad"
    val result1 = solution.longestPalindrome(s1)
    println("Example 1:")
    println("Input: s = \"$s1\"")
    println("Output: \"$result1\"")
    println("Expected: \"bab\" or \"aba\"")
    val isValid1 = result1 == "bab" || result1 == "aba"
    println("✅ ${if (isValid1) "PASS" else "FAIL"}")
    println()
    
    // Test Example 2
    val s2 = "cbbd"
    val result2 = solution.longestPalindrome(s2)
    println("Example 2:")
    println("Input: s = \"$s2\"")
    println("Output: \"$result2\" (Expected: \"bb\")")
    println("✅ ${if (result2 == "bb") "PASS" else "FAIL"}")
    println()
    
    // Edge Case 1 - Single Character
    val s3 = "a"
    val result3 = solution.longestPalindrome(s3)
    println("Edge Case 1 - Single Character:")
    println("Input: s = \"$s3\"")
    println("Output: \"$result3\" (Expected: \"a\")")
    println("✅ ${if (result3 == "a") "PASS" else "FAIL"}")
    println()
    
    // Edge Case 2 - All Same Characters
    val s4 = "aaaa"
    val result4 = solution.longestPalindrome(s4)
    println("Edge Case 2 - All Same Characters:")
    println("Input: s = \"$s4\"")
    println("Output: \"$result4\" (Expected: \"aaaa\")")
    println("✅ ${if (result4 == "aaaa") "PASS" else "FAIL"}")
    println()
    
    // Edge Case 3 - No Palindrome > 1
    val s5 = "abcd"
    val result5 = solution.longestPalindrome(s5)
    println("Edge Case 3 - No Palindrome > 1:")
    println("Input: s = \"$s5\"")
    println("Output: \"$result5\" (Expected: any single character)")
    val isValid5 = result5.length == 1 && s5.contains(result5)
    println("✅ ${if (isValid5) "PASS" else "FAIL"}")
    println()
    
    // Test Case 4 - Even Length Palindrome
    val s6 = "abccba"
    val result6 = solution.longestPalindrome(s6)
    println("Test Case 4 - Even Length Palindrome:")
    println("Input: s = \"$s6\"")
    println("Output: \"$result6\" (Expected: \"abccba\")")
    println("✅ ${if (result6 == "abccba") "PASS" else "FAIL"}")
    println()
    
    // Test Case 5 - Mixed Palindromes
    val s7 = "raceacar"
    val result7 = solution.longestPalindrome(s7)
    println("Test Case 5 - Mixed Palindromes:")
    println("Input: s = \"$s7\"")
    println("Output: \"$result7\" (Expected: \"racecar\")")
    println("✅ ${if (result7 == "racecar") "PASS" else "FAIL"}")
    println()
    
    println("=" * 45)
    println("🎯 Implementation ready for your solution!")
}

class Solution {
    /**
     * 5. Longest Palindromic Substring
     * 
     * TODO: Implement your solution here!
     * 
     * Approaches to consider:
     * 
     * 1. Brute Force - O(n³) time, O(1) space
     *    - Check all substrings, verify if palindrome
     * 
     * 2. Expand Around Centers - O(n²) time, O(1) space (RECOMMENDED)
     *    - For each possible center, expand outward
     *    - Handle both odd and even length palindromes
     * 
     * 3. Dynamic Programming - O(n²) time, O(n²) space
     *    - Build table where dp[i][j] = true if s[i...j] is palindrome
     * 
     * 4. Manacher's Algorithm - O(n) time, O(n) space (ADVANCED)
     *    - Linear time algorithm with preprocessing
     * 
     * Tips:
     * - Start with expand around centers approach
     * - Remember to handle both odd and even length palindromes
     * - Keep track of the longest palindrome found so far
     * - Be careful with string indexing and bounds
     * 
     * @param s: Input string to find longest palindrome in
     * @return: The longest palindromic substring
     */
    fun longestPalindrome(s: String): String {
        // TODO: Your implementation goes here
        
        // Placeholder return - replace with your solution
        return ""
    }
    
    /**
     * Helper function for expand around centers approach
     * Expands around center and returns the palindrome found
     * 
     * @param s: Input string
     * @param left: Left pointer/center
     * @param right: Right pointer/center  
     * @return: Palindrome string found by expanding around center
     */
    private fun expandAroundCenter(s: String, left: Int, right: Int): String {
        // TODO: Implement this helper if using expand around centers approach
        return ""
    }
    
    /**
     * Helper function to check if a string is palindrome
     * Useful for brute force approach
     * 
     * @param s: String to check
     * @return: True if string is palindrome, false otherwise
     */
    private fun isPalindrome(s: String): Boolean {
        // TODO: Implement this helper if using brute force approach
        return false
    }
}

// Helper extension function for cleaner output
operator fun String.times(n: Int): String = this.repeat(n)