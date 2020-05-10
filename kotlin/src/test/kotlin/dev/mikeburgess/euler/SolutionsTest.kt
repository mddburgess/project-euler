package dev.mikeburgess.euler

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

class SolutionsTest {

    @ParameterizedTest
    @EnumSource(Solutions::class)
    fun testSolutions(solution: Solutions) {
        assertThat(solution.name, solution.problem.solve(), equalTo(solution.answer))
    }
}
