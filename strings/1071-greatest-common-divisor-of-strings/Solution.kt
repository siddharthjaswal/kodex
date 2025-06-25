class Solution {
    /**
     * Finds the greatest common divisor of two strings.
     *
     * A string 't' divides a string 's' if 's' can be formed by concatenating 't' with itself one or more times.
     * This function returns the largest string 'x' that divides both str1 and str2.
     *
     * @param str1 The first string.
     * @param str2 The second string.
     * @return The largest string that is a common divisor of both str1 and str2, or an empty string if none exists.
     */
    fun gcdOfStrings(str1: String, str2: String): String {
        // If the concatenated strings are not equal, then no common divisor can exist.
        // For a string 'x' to be a common divisor, both str1 and str2 must be formed by repeating 'x'.
        // This property implies that str1 + str2 must equal str2 + str1.
        if (str1 + str2 != str2 + str1) {
            return ""
        }

        // The length of the greatest common divisor string must be the greatest common divisor
        // of the lengths of the input strings.
        val gcdLength = gcd(str1.length, str2.length)

        // The greatest common divisor string is the prefix of str1 with the calculated GCD length.
        return str1.substring(0, gcdLength)
    }

    /**
     * Calculates the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The greatest common divisor of a and b.
     */
    private fun gcd(a: Int, b: Int): Int {
        var num1 = a
        var num2 = b
        while (num2 != 0) {
            val temp = num2
            num2 = num1 % num2
            num1 = temp
        }
        return num1
    }
}