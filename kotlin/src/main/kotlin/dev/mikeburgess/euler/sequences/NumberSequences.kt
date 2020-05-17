package dev.mikeburgess.euler.sequences

fun fibonacciNumbers() =
    generateSequence(1L to 2L) { (a, b) -> b to a + b }
        .map { it.first }

fun triangleNumbers() =
    generateSequence(1L to 2L) { (_, n) -> n * (n + 1) / 2 to n + 1 }
        .map { it.first }
