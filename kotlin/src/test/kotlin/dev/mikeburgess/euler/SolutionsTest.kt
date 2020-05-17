package dev.mikeburgess.euler

import dev.mikeburgess.euler.problems.problems
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource
import org.junit.jupiter.params.provider.MethodSource

class SolutionsTest {

    @ParameterizedTest
    @MethodSource("problemNumbers")
    fun testSolutions(n: Int) {
        assertThat(problems[n]?.solve(), equalTo(solutions[n]))
    }

    companion object {
        @JvmStatic
        fun problemNumbers() = problems.keys
    }
}
