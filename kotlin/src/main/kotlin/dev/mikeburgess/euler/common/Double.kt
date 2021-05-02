package dev.mikeburgess.euler.common

import kotlin.math.floor

fun Double.isInteger() =
    floor(this) == this
