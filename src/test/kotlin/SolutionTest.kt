import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SolutionTest {
    private var solution = Solution()

    @Test
    fun removeDuplicates() {
        val input = intArrayOf(0,0,0,1,2,2,3)
        assertEquals(6, solution.removeDuplicates(input))
        assertArrayEquals(intArrayOf(0,0,1,2,2,3,3),input)
    }
    @Test
    fun removeDuplicates2() {
        val input = intArrayOf(0,0,1,1,1,1,2,3,3)
        assertEquals(7, solution.removeDuplicates(input))
        assertArrayEquals(intArrayOf(0,0,1,1,2,3,3,3,3),input)
    }
}