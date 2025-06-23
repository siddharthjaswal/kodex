/**
 * Definition for singly-linked list.
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    /**
     * Adds two numbers represented as linked lists in reverse order.
     * 
     * Approach: Iterative with carry propagation
     * Time Complexity: O(max(m, n)) where m and n are lengths of input lists
     * Space Complexity: O(max(m, n)) for the result list
     * 
     * @param l1 First number as linked list (digits in reverse order)
     * @param l2 Second number as linked list (digits in reverse order)
     * @return Sum as linked list (digits in reverse order)
     */
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val dummy = ListNode(0)  // Dummy head to simplify list construction
        var current = dummy
        var carry = 0
        var p1 = l1
        var p2 = l2
        
        // Process both lists while at least one has remaining nodes or carry exists
        while (p1 != null || p2 != null || carry != 0) {
            val x = p1?.`val` ?: 0  // Get value or 0 if node is null
            val y = p2?.`val` ?: 0  // Get value or 0 if node is null
            
            val sum = x + y + carry
            carry = sum / 10  // New carry for next iteration
            
            // Create new node with current digit
            current.next = ListNode(sum % 10)
            current = current.next!!
            
            // Move to next nodes if they exist
            p1 = p1?.next
            p2 = p2?.next
        }
        
        return dummy.next  // Return actual head (skip dummy)
    }
    
    /**
     * Alternative recursive solution.
     * 
     * @param l1 First number as linked list
     * @param l2 Second number as linked list
     * @param carry Current carry value
     * @return Sum as linked list
     */
    fun addTwoNumbersRecursive(l1: ListNode?, l2: ListNode?, carry: Int = 0): ListNode? {
        // Base case: if both lists are null and no carry, return null
        if (l1 == null && l2 == null && carry == 0) {
            return null
        }
        
        val x = l1?.`val` ?: 0
        val y = l2?.`val` ?: 0
        val sum = x + y + carry
        
        val result = ListNode(sum % 10)
        result.next = addTwoNumbersRecursive(l1?.next, l2?.next, sum / 10)
        
        return result
    }
}

/**
 * Helper functions for testing
 */
object TestHelper {
    /**
     * Creates a linked list from an array of integers
     */
    fun createLinkedList(nums: IntArray): ListNode? {
        if (nums.isEmpty()) return null
        
        val head = ListNode(nums[0])
        var current = head
        
        for (i in 1 until nums.size) {
            current.next = ListNode(nums[i])
            current = current.next!!
        }
        
        return head
    }
    
    /**
     * Converts linked list to array for easy verification
     */
    fun linkedListToArray(head: ListNode?): IntArray {
        val result = mutableListOf<Int>()
        var current = head
        
        while (current != null) {
            result.add(current.`val`)
            current = current.next
        }
        
        return result.toIntArray()
    }
    
    /**
     * Prints linked list in readable format
     */
    fun printLinkedList(head: ListNode?): String {
        val values = linkedListToArray(head)
        return "[${values.joinToString(", ")}]"
    }
}

/**
 * Test cases
 */
fun main() {
    val solution = Solution()
    
    // Test Case 1: [2,4,3] + [5,6,4] = [7,0,8]
    val l1 = TestHelper.createLinkedList(intArrayOf(2, 4, 3))
    val l2 = TestHelper.createLinkedList(intArrayOf(5, 6, 4))
    val result1 = solution.addTwoNumbers(l1, l2)
    println("Test 1: ${TestHelper.printLinkedList(result1)}") // Expected: [7, 0, 8]
    
    // Test Case 2: [0] + [0] = [0]
    val l3 = TestHelper.createLinkedList(intArrayOf(0))
    val l4 = TestHelper.createLinkedList(intArrayOf(0))
    val result2 = solution.addTwoNumbers(l3, l4)
    println("Test 2: ${TestHelper.printLinkedList(result2)}") // Expected: [0]
    
    // Test Case 3: [9,9,9,9,9,9,9] + [9,9,9,9] = [8,9,9,9,0,0,0,1]
    val l5 = TestHelper.createLinkedList(intArrayOf(9, 9, 9, 9, 9, 9, 9))
    val l6 = TestHelper.createLinkedList(intArrayOf(9, 9, 9, 9))
    val result3 = solution.addTwoNumbers(l5, l6)
    println("Test 3: ${TestHelper.printLinkedList(result3)}") // Expected: [8, 9, 9, 9, 0, 0, 0, 1]
}