package dev.mikeburgess.euler.common

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Long {

    @Test
    fun testIsPandigital() {
        assertThat(192384576L.isPandigital()).isTrue()
    }
}
