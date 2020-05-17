package dev.mikeburgess.euler

import dev.mikeburgess.euler.sequences.CollatzLengthSequence
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

class SequenceTests {

    @Test
    fun testCollatzLengthSequence() {
        val oeisA006577 = listOf(
            0L, 1, 7, 2, 5, 8, 16, 3, 19, 6, 14, 9, 9, 17, 17, 4, 12, 20,
            20, 7, 7, 15, 15, 10, 23, 10, 111, 18, 18, 18, 106, 5, 26, 13, 13, 21,
            21, 21, 34, 8, 109, 8, 29, 16, 16, 16, 104, 11, 24, 24, 24, 11, 11, 112,
            112, 19, 32, 19, 32, 19, 19, 107, 107, 6, 27, 27, 27, 14, 14, 14, 102, 22
        )
        assertThat(CollatzLengthSequence().take(72).toList(), equalTo(oeisA006577))
    }
}
