# 5. Longest Palindromic Substring

**Difficulty:** Medium  
**Topics:** String, Dynamic Programming  
**Companies:** Amazon, Microsoft, Google, Apple, Facebook

## Problem Statement

Given a string `s`, return *the longest palindromic substring* in `s`.

## Examples

### Example 1:

```
Input: s = "babad"
Output: "bab"
```

**Explanation:** "aba" is also a valid answer.

### Example 2:

```
Input: s = "cbbd"
Output: "bb"
```

## Constraints

- `1 <= s.length <= 1000`
- `s` consist of only digits and English letters.

## Approach Ideas

### 1. Brute Force
- Check all possible substrings
- For each substring, verify if it's a palindrome
- **Time Complexity:** O(n³)
- **Space Complexity:** O(1)

### 2. Expand Around Centers
- For each character (and between characters), expand outward
- Check if characters match while expanding
- **Time Complexity:** O(n²)
- **Space Complexity:** O(1)

### 3. Dynamic Programming
- Build a 2D table where dp[i][j] represents if substring from i to j is palindrome
- Fill table bottom-up using smaller palindrome results
- **Time Complexity:** O(n²)
- **Space Complexity:** O(n²)

### 4. Manacher's Algorithm (Advanced)
- Linear time algorithm using preprocessing and center expansion
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

## Key Insights

- **Palindrome Properties:** A string is palindrome if it reads same forwards and backwards
- **Two Types of Centers:** Odd length palindromes (center on character) vs Even length (center between characters)
- **Expand Around Centers:** Most intuitive approach with good time complexity
- **Edge Cases:** Single character strings, empty strings, all same characters

## Implementation Notes

- Handle both odd and even length palindromes
- Keep track of the longest palindrome found so far
- Consider starting with expand around centers approach
- Optimize by avoiding unnecessary substring creation

## Similar Problems

- Palindromic Substrings (Count all palindromes)
- Valid Palindrome
- Shortest Palindrome
- Palindrome Partitioning

## Tags

`#string` `#dynamic-programming` `#expand-around-centers` `#palindrome` `#medium`