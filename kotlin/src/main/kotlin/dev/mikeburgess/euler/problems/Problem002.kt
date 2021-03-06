package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.sequences.fibonacciNumbers

/**
 * Problem 2
 *
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By
 * starting with 1 and 2, the first 10 terms will be:
 *
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find
 * the sum of the even-valued terms.
 */
class Problem002 : Problem {

    override fun solve(): Long =
        fibonacciNumbers()
            .takeWhile { it < 4_000_000 }
            .filter { it % 2 == 0L }
            .sum()
}
