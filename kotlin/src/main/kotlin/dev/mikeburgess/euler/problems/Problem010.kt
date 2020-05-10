package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.Problem
import dev.mikeburgess.euler.common.PrimeNumberSequence

/**
 * Problem 10
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 */
class Problem010 : Problem {

    override fun solve(): Long =
        PrimeNumberSequence()
            .takeWhile { it < 2_000_000 }
            .sum()
}
