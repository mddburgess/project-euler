package dev.mikeburgess.euler.problems

/**
 * Problem 1
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
class Problem001 : Problem {

    override fun solve(): Long =
        (1..999L).filter { it % 3 == 0L || it % 5 == 0L }
            .sum()
}
