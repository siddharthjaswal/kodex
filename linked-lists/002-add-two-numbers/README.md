# Folder Structure

```
002-add-two-numbers/
├── README.md
└── Solution.kt
```

# 2. Add Two Numbers

**Difficulty:** Medium  
**Topics:** Linked List, Math, Recursion  
**Companies:** Amazon, Microsoft, Google, Apple, Facebook

## Problem Statement

You are given two **non-empty** linked lists representing two non-negative integers. The digits are stored in **reverse order**, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

## Examples

### Example 1:

```
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
```

### Example 2:

```
Input: l1 = [0], l2 = [0]
Output: [0]
```

### Example 3:

```
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
```

## Constraints

- The number of nodes in each linked list is in the range `[1, 100]`.
- `0 <= Node.val <= 9`
- It is guaranteed that the list represents a number that does not have leading zeros.

## Approach Ideas

### 1. Iterative Approach with Carry
- Traverse both linked lists simultaneously
- Add corresponding digits along with carry from previous addition
- Create new nodes for the result
- **Time Complexity:** O(max(m, n))
- **Space Complexity:** O(max(m, n))

### 2. Recursive Approach
- Recursively add digits with carry propagation
- Base case when both lists are null and carry is 0
- **Time Complexity:** O(max(m, n))
- **Space Complexity:** O(max(m, n))

## Key Insights

- **Reverse Order:** Digits are stored in reverse, making addition straightforward (start from least significant digit)
- **Carry Handling:** Must properly handle carry when sum >= 10
- **Different Lengths:** Lists may have different lengths, handle remaining digits
- **Final Carry:** Don't forget to add final carry as new node if needed

## Implementation Notes

- Handle cases where one list is longer than the other
- Remember to add final carry if it exists
- Use dummy head node to simplify list construction
- Be careful with null pointer access

## Similar Problems

- Add Two Numbers II (digits stored in normal order)
- Multiply Strings
- Add Strings
- Plus One

## Tags

`#linked-list` `#math` `#recursion` `#carry` `#medium`