package dev.mikeburgess.euler

import dev.mikeburgess.euler.sequences.permutations
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PermutationsTest {

    @Test
    fun testPermutations() {
        val objects = listOf(1, 2, 3, 4)
        assertThat(objects.permutations().toList()).containsExactly(
            listOf(1, 2, 3, 4), listOf(2, 1, 3, 4), listOf(3, 1, 2, 4), listOf(1, 3, 2, 4),
            listOf(2, 3, 1, 4), listOf(3, 2, 1, 4), listOf(4, 2, 1, 3), listOf(2, 4, 1, 3),
            listOf(1, 4, 2, 3), listOf(4, 1, 2, 3), listOf(2, 1, 4, 3), listOf(1, 2, 4, 3),
            listOf(1, 3, 4, 2), listOf(3, 1, 4, 2), listOf(4, 1, 3, 2), listOf(1, 4, 3, 2),
            listOf(3, 4, 1, 2), listOf(4, 3, 1, 2), listOf(4, 3, 2, 1), listOf(3, 4, 2, 1),
            listOf(2, 4, 3, 1), listOf(4, 2, 3, 1), listOf(3, 2, 4, 1), listOf(2, 3, 4, 1)
        )
        assertThat(objects).containsExactly(1, 2, 3, 4)
    }
}
