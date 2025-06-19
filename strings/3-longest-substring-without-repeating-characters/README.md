# 3. Longest Substring Without Repeating Characters

**Difficulty:** Medium  
**Topics:** Hash Table, String, Sliding Window  
**Companies:** Amazon, Google, Microsoft, Facebook

## Problem Statement

Given a string `s`, find the length of the **longest substring** without duplicate characters.

## Examples

### Example 1:
```
Input: s = "abcabcbb"
Output: 3
```
**Explanation:** The answer is "abc", with the length of 3.

### Example 2:
```
Input: s = "bbbbb"
Output: 1
```
**Explanation:** The answer is "b", with the length of 1.

### Example 3:
```
Input: s = "pwwkew"
Output: 3
```
**Explanation:** The answer is "wke", with the length of 3.  
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

## Constraints

- `0 <= s.length <= 5 * 10^4`
- `s` consists of English letters, digits, symbols and spaces.

## Approach Ideas

### 1. Brute Force
- Check all possible substrings
- For each substring, verify if all characters are unique
- **Time Complexity:** O(n³)
- **Space Complexity:** O(min(m,n))

### 2. Sliding Window with Hash Set
- Use two pointers (left and right) to maintain a window
- Expand right pointer and add characters to set
- When duplicate found, shrink window from left
- **Time Complexity:** O(2n) = O(n)
- **Space Complexity:** O(min(m,n))

### 3. Optimized Sliding Window with Hash Map
- Store character positions in hash map
- When duplicate found, jump left pointer directly
- **Time Complexity:** O(n)
- **Space Complexity:** O(min(m,n))

## Key Insights

- **Substring vs Subsequence:** Substring must be contiguous
- **Sliding Window:** Efficient technique for substring problems
- **Hash Table:** Quick lookup for character existence/position
- **Two Pointers:** Maintain window boundaries

## Similar Problems

- Longest Substring with At Most K Distinct Characters
- Minimum Window Substring
- Longest Repeating Character Replacement

## Tags
`#sliding-window` `#hash-table` `#string` `#two-pointers` `#medium`