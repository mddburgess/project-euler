package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.Problem
import java.math.BigInteger

class Problem016 : Problem {

    private fun BigInteger.sumDigits() =
        this.toString()
            .toCharArray()
            .map { it - '0' }
            .sum()

    override fun solve(): Long =
        BigInteger.valueOf(2).pow(1000).sumDigits().toLong()
}
