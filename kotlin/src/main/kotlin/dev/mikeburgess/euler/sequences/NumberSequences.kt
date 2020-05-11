package dev.mikeburgess.euler.sequences

fun collatzSequence(start: Long) =
    generateSequence(start) {
        when {
            it == 1L -> null
            it % 2 == 0L -> it / 2
            else -> 3 * it + 1
        }
    }

fun fibonacciNumbers() =
    generateSequence(1L to 2L) { (a, b) -> b to a + b }
        .map { it.first }

fun triangleNumbers() =
    generateSequence(1L to 2L) { (_, n) -> n * (n + 1) / 2 to n + 1 }
        .map { it.first }
