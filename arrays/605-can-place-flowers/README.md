# 605. Can Place Flowers

## Problem Statement

You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array `flowerbed` containing `0`'s and `1`'s, where `0` means empty and `1` means not empty, and an integer `n`, return `true` if `n` new flowers can be planted in the `flowerbed` without violating the no-adjacent-flowers rule and `false` otherwise.

### Examples

**Example 1:**
**Input:** `flowerbed = [1,0,0,0,1]`, `n = 1`
**Output:** `true`

**Example 2:**
**Input:** `flowerbed = [1,0,0,0,1]`, `n = 2`
**Output:** `false`

### Constraints

* `1 <= flowerbed.length <= 2 * 10^4`
* `flowerbed[i]` is `0` or `1`.
* There are no two adjacent flowers in `flowerbed`.
* `0 <= n <= flowerbed.length`

## Solution Approach

The problem can be solved using a greedy approach. We iterate through the `flowerbed` array and try to plant a flower at each empty plot. An empty plot is a valid position for a new flower if its adjacent plots are also empty.

The conditions for planting a flower at index `i` are:
1.  The plot at index `i` must be empty (`flowerbed[i] == 0`).
2.  The plot at index `i-1` must be empty. This condition is implicitly true if `i` is the first plot (index 0).
3.  The plot at index `i+1` must be empty. This condition is implicitly true if `i` is the last plot.

We can iterate through the `flowerbed` and for each plot, check if it and its neighbors satisfy the conditions for planting a new flower. If they do, we place a flower (by marking the plot as `1`) and decrement the count of flowers to be planted (`n`). If we successfully plant all `n` flowers, we can return `true`.

The provided Kotlin solution implements this greedy strategy. It iterates through the `flowerbed` array, and for each plot, it checks if it's empty. If it is, it then verifies if the previous and next plots are also empty (handling the edge cases for the first and last plots). If a valid spot is found, it "plants" a flower by changing the value in the array to `1` and decrements the remaining number of flowers to be planted. If the count of remaining flowers to plant reaches zero or less at any point, it means we have found enough spots, and the function returns `true`. If the loop completes and there are still flowers to be planted, it returns `false`.

## Complexity Analysis

* **Time Complexity:** $O(m)$, where `m` is the length of the `flowerbed` array. We perform a single pass through the array.
* **Space Complexity:** $O(1)$, as we are modifying the input array in-place and using only a few extra variables.

## How to Use

1.  Save the Kotlin code in a file named `Solution.kt`.
2.  Create an instance of the `Solution` class.
3.  Call the `canPlaceFlowers` method with the `flowerbed` array and the integer `n`.

### Example Usage:

```kotlin
fun main() {
    val solution = Solution()

    val flowerbed1 = intArrayOf(1, 0, 0, 0, 1)
    val n1 = 1
    println("Can plant $n1 flowers in ${flowerbed1.contentToString()}: ${solution.canPlaceFlowers(flowerbed1, n1)}") // Output: true

    val flowerbed2 = intArrayOf(1, 0, 0, 0, 1)
    val n2 = 2
    println("Can plant $n2 flowers in ${flowerbed2.contentToString()}: ${solution.canPlaceFlowers(flowerbed2, n2)}") // Output: false
}