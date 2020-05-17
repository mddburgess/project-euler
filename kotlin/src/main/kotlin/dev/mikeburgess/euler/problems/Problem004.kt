package dev.mikeburgess.euler.problems

/**
 * Problem 4
 *
 * A palindromic number reads the same both ways. The largest palindrome made from the product of
 * two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
class Problem004 : Problem {

    private fun Long.isPalindrome(): Boolean {
        var temp = this
        var reverse = 0L
        while (temp > 0) {
            val remainder = temp % 10
            reverse = reverse * 10 + remainder
            temp /= 10
        }
        return this == reverse
    }

    override fun solve(): Long =
        (100..999L).associateWith { (it..999L) }
            .flatMap { entry -> entry.value.map { entry.key * it } }
            .filter { it.isPalindrome() }
            .max()!!
}
