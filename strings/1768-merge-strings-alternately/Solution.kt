class Solution {
    /**
     * Merges two strings by adding letters in alternating order.
     *
     * @param word1 The first string.
     * @param word2 The second string.
     * @return The merged string.
     */
    fun mergeAlternately(word1: String, word2: String): String {
        val merged = StringBuilder()
        val len1 = word1.length
        val len2 = word2.length
        var i = 0
        var j = 0

        // Append characters alternately while both strings have characters
        while (i < len1 && j < len2) {
            merged.append(word1[i++])
            merged.append(word2[j++])
        }

        // Append the remaining part of word1, if any
        if (i < len1) {
            merged.append(word1.substring(i))
        }

        // Append the remaining part of word2, if any
        if (j < len2) {
            merged.append(word2.substring(j))
        }

        return merged.toString()
    }
}