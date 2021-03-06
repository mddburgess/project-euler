package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.common.digits
import kotlin.math.pow

/**
 * Problem 30
 *
 * Surprisingly there are only three numbers that can be written as the sum of fourth powers of
 * their digits:
 *
 * 1634 = 1^4 + 6^4 + 3^4 + 4^4
 * 8208 = 8^4 + 2^4 + 0^4 + 8^4
 * 9474 = 9^4 + 4^4 + 7^4 + 4^4
 *
 * As 1 = 1^4 is not a sum it is not included.
 *
 * The sum of these numbers is 1634 + 8208 + 9474 = 19316.
 *
 * Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 */
class Problem030 : Problem {

    private val fifthPowers = (0..9).map { it.toDouble().pow(5).toInt() }

    override fun solve(): Long =
        (2..354294)
            .associateWith { it.digits.map { digit -> fifthPowers[digit] }.sum() }
            .filter { (number, digitSum) -> number == digitSum }
            .keys.sum().toLong()
}
