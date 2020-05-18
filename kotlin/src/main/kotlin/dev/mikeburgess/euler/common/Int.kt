package dev.mikeburgess.euler.common

val Int.properDivisors: List<Int>
    get() = IntRange(1, this / 2).filter { this % it == 0 }

fun Int.isEven() = this % 2 == 0
