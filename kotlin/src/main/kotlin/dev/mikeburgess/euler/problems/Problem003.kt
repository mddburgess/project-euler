package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.Problem

/**
 * Problem 3
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143?
 */
class Problem003 : Problem {

    override fun solve(): Long {
        var number = 600_851_475_143
        var factor = 2L
        while (factor < number) {
            when {
                number % factor == 0L -> number /= factor
                else -> factor++
            }
        }
        return factor
    }
}
