package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.sequences.PrimeSequence
import dev.mikeburgess.euler.sequences.triangleNumbers
import kotlin.math.sqrt

/**
 * Problem 12
 *
 * The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle
 * number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
 *
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 *
 * Let us list the factors of the first seven triangle numbers:
 *
 * 1: 1
 * 3: 1,3
 * 6: 1,2,3,6
 * 10: 1,2,5,10
 * 15: 1,3,5,15
 * 21: 1,3,7,21
 * 28: 1,2,4,7,14,28
 *
 * We can see that 28 is the first triangle number to have over five divisors.
 *
 * What is the value of the first triangle number to have over five hundred divisors?
 */
class Problem012 : Problem {

    private val primes = PrimeSequence()

    private fun Long.countDivisors(): Int =
        when (this) {
            1L -> 1
            2L, 3L -> 2
            else -> primes.takeWhile { it <= sqrt(this.toDouble()) }
                .map { this.countFactors(it) + 1 }
                .reduce { a, b -> a * b }
        }

    private fun Long.countFactors(prime: Long): Int {
        var count = 0
        var temp = this
        while (temp % prime == 0L) {
            temp /= prime
            count++
        }
        return count
    }

    override fun solve(): Long =
        triangleNumbers()
            .first { it.countDivisors() > 500 }
}
