package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.common.sumDigits
import java.math.BigInteger

/**
 * Problem 16
 *
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 *
 * What is the sum of the digits of the number 2^1000?
 */
class Problem016 : Problem {

    override fun solve(): Long =
        BigInteger.valueOf(2).pow(1000).sumDigits().toLong()
}
