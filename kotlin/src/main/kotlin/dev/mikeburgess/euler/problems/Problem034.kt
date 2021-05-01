package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.common.digits
import dev.mikeburgess.euler.common.factorial
import dev.mikeburgess.euler.sequences.factorialNumbers

/**
 * 145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
 *
 * Find the sum of all numbers which are equal to the sum of the factorial of their digits.
 *
 * Note: As 1! = 1 and 2! = 2 are not sums they are not included.
 */
class Problem034 : Problem {

    override fun solve(): Long {
        val largest = 7 * factorial(9).toInt()
        val factorials = factorialNumbers().take(9).toMutableList()
        factorials.add(0, 1L)

        return (3..largest)
            .map { it to it.digits.map { digit -> factorials[digit] }.sum() }
            .filter { (n, sum) -> n.toLong() == sum }
            .map { (_, sum) -> sum }
            .sum()
    }
}
