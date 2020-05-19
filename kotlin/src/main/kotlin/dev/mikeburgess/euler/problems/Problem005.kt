package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.common.lcm

/**
 * Problem 5
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any
 * remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
class Problem005 : Problem {

    override fun solve(): Long =
        (1..20L).reduce { x, y -> lcm(x, y) }
}
