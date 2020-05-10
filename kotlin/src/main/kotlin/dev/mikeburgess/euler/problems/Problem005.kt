package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.Problem

/**
 * Problem 5
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any
 * remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
class Problem005 : Problem {

    private fun lcm(x: Long, y: Long): Long =
        x * y / gcd(x, y)

    private fun gcd(x: Long, y: Long): Long =
        when (y) {
            0L -> x
            else -> gcd(y, x % y)
        }

    override fun solve(): Long =
        LongRange(1, 20).reduce(::lcm)
}
