package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.common.isPandigital
import dev.mikeburgess.euler.sequences.PrimeSequence

/**
 * We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n
 * exactly once. For example, 2143 is a 4-digit pandigital and is also prime.
 *
 * What is the largest n-digit pandigital prime that exists?
 */
class Problem041 : Problem {

    override fun solve(): Long =
        PrimeSequence()
            .takeWhile { it <= 7_654_321 }
            .filter { it.isPandigital() }
            .max()!!
}
