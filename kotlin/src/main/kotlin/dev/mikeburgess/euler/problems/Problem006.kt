package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.Problem

/**
 * Problem 6
 *
 * The sum of the squares of the first ten natural numbers is,
 *
 * 1^2 + 2^2 + ... + 10^2 = 385
 *
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 552 = 3025
 *
 * Hence the difference between the sum of the squares of the first ten natural numbers and the
 * square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers and
 * the square of the sum.
 */
class Problem006 : Problem {

    private fun Long.square(): Long =
        this * this

    override fun solve(): Long {
        val sumOfSquares = LongRange(1, 100).map { it.square() }.sum()
        val squareOfSums = LongRange(1, 100).sum().square()
        return squareOfSums - sumOfSquares
    }
}
