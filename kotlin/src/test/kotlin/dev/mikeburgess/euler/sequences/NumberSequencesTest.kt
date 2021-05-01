package dev.mikeburgess.euler.sequences

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NumberSequencesTest {

    @Test
    fun testFactorialNumbers() {
        assertThat(factorialNumbers().take(10).toList())
            .containsExactly(1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800)
    }

    @Test
    fun testFibonacciNumbers() {
        assertThat(fibonacciNumbers().take(10).toList())
            .containsExactly(1, 2, 3, 5, 8, 13, 21, 34, 55, 89)
    }

    @Test
    fun testTriangleNumbers() {
        assertThat(triangleNumbers().take(10).toList())
            .containsExactly(1, 3, 6, 10, 15, 21, 28, 36, 45, 55)
    }
}
