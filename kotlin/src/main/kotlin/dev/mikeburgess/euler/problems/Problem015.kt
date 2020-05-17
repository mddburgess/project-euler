package dev.mikeburgess.euler.problems

/**
 * Problem 15
 *
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
 * there are exactly 6 routes to the bottom right corner.
 *
 * How many such routes are there through a 20×20 grid?
 */
class Problem015 : Problem {

    private fun LongRange.product(f: (Long, Long, Long) -> Long): Long =
        this.fold(1L) { acc, i -> f(acc, i, this.last) }

    override fun solve(): Long =
        (1..20L).product { acc, i, n -> acc * (n + i) / i }
}
