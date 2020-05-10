package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.Problem

/**
 * Problem 9
 *
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 * a^2 + b^2 = c^2
 *
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
class Problem009 : Problem {

    private infix fun <A, B, C> Pair<A, B>.to(c: C): Triple<A, B, C> =
        Triple(this.first, this.second, c)

    private fun Triple<Long, Long, Long>.isPythagorean(): Boolean =
        first * first + second * second == third * third

    override fun solve(): Long {
        val (a, b, c) = LongRange(1, 332)
            .flatMap { a -> LongRange(a + 1, (1000 - a) / 2).map { b -> a to b } }
            .map { (a, b) -> a to b to 1000 - a - b }
            .first { it.isPythagorean() }
        return a * b * c
    }
}
