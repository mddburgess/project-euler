package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.common.isPalindrome

/**
 * The decimal number, 585 = 1001001001 (binary), is palindromic in both bases.
 *
 * Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.
 *
 * (Please note that the palindromic number, in either base, may not include leading zeros.)
 */
class Problem036 : Problem {

    override fun solve(): Long =
        (1L..999_999 step 2)
            .filter { it.isPalindrome(10) }
            .filter { it.isPalindrome(2) }
            .sum()
}
