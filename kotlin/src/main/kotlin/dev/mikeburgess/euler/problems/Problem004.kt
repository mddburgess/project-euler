package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.common.isPalindrome

/**
 * Problem 4
 *
 * A palindromic number reads the same both ways. The largest palindrome made from the product of
 * two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
class Problem004 : Problem {

    override fun solve(): Long =
        (100..999L).associateWith { (it..999L) }
            .flatMap { entry -> entry.value.map { entry.key * it } }
            .filter { it.isPalindrome() }
            .max()!!
}
