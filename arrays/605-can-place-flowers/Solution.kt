class Solution {
    /**
     * Determines if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
     *
     * @param flowerbed An integer array where 0 means empty and 1 means not empty.
     * @param n The number of new flowers to be planted.
     * @return True if n new flowers can be planted, false otherwise.
     */
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var count = 0
        var i = 0
        var remainingN = n

        while (i < flowerbed.size) {
            if (flowerbed[i] == 0) {
                val isPrevEmpty = (i == 0) || (flowerbed[i - 1] == 0)
                val isNextEmpty = (i == flowerbed.size - 1) || (flowerbed[i + 1] == 0)

                if (isPrevEmpty && isNextEmpty) {
                    flowerbed[i] = 1 // Plant a flower
                    remainingN--
                    if (remainingN <= 0) {
                        return true
                    }
                }
            }
            i++
        }

        return remainingN <= 0
    }
}