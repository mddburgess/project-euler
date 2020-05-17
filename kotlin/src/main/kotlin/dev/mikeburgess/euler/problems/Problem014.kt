package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.sequences.CollatzLengthSequence

/**
 * The following iterative sequence is defined for the set of positive integers:
 *
 * n -> n / 2 (n is even)
 * n -> 3n + 1 (n is odd)
 *
 * Using the rule above and starting with 13, we generate the following sequence:
 *
 * 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 *
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers
 * finish at 1.
 *
 * Which starting number, under one million, produces the longest chain?
 *
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */
class Problem014 : Problem {

    override fun solve(): Long =
        CollatzLengthSequence()
            .take(999_999)
            .withIndex()
            .maxBy { it.value }!!
            .index + 1L
}
