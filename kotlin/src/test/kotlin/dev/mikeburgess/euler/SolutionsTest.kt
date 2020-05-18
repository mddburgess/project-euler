package dev.mikeburgess.euler

import dev.mikeburgess.euler.problems.problems
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class SolutionsTest {

    @ParameterizedTest
    @MethodSource("problemNumbers")
    fun testSolutions(n: Int) {
        assertThat(problems[n]?.solve()).isEqualTo(solutions[n])
    }

    companion object {
        @JvmStatic
        fun problemNumbers() = problems.keys
    }
}
