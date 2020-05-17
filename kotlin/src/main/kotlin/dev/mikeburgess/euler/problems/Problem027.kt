package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.sequences.PrimeSequence
import dev.mikeburgess.euler.sequences.isPrime

/**
 * Problem 27
 *
 * Euler discovered the remarkable quadratic formula:
 *
 * n^2 + n + 41
 *
 * It turns out that the formula will produce 40 primes for the consecutive integer values
 * 0 <= n <= 39. However, when n = 40, 40^2 + 40 + 41 = 40(40 + 1) + 41 is divisible by 41, and
 * certainly when n = 41, 41^2 + 41 + 41 is clearly divisible by 41.
 *
 * The incredible formula n^2 − 79n + 1601 was discovered, which produces 80 primes for the
 * consecutive values 0 <= n <= 79. The product of the coefficients, −79 and 1601, is −126479.
 *
 * Considering quadratics of the form:
 *
 * n^2 + an + b, where |a| < 1000 and |b| <= 1000
 *
 * where |n| is the modulus/absolute value of n (e.g. |11| = 11 and |−4| = 4)
 *
 * Find the product of the coefficients, a and b, for the quadratic expression that produces the
 * maximum number of primes for consecutive values of n, starting with n = 0.
 */
class Problem027 : Problem {

    private fun countConsecutivePrimes(a: Long, b: Long): Long {
        return generateSequence(0L) { it + 1 }
            .map { it * (it + a) + b }
            .takeWhile { it.isPrime() }
            .count().toLong()
    }

    override fun solve(): Long {
        val (a, b) = PrimeSequence()
            .takeWhile { it <= 1000 }
            .flatMap { b -> ((1 - b)..999L).map { it to b }.asSequence() }
            .associateWith { (a, b) -> countConsecutivePrimes(a, b) }
            .maxBy { it.value }!!
            .key
        return a * b
    }
}
