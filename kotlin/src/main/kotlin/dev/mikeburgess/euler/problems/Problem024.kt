package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.Problem
import dev.mikeburgess.euler.common.factorial

/**
 * Problem 24
 *
 * A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation
 * of the digits 1, 2, 3 and 4. If all of the permutations are listed numerically or alphabetically,
 * we call it lexicographic order. The lexicographic permutations of 0, 1 and 2 are:
 *
 * 012   021   102   120   201   210
 *
 * What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
 */
class Problem024 : Problem {

    override fun solve(): Long {
        val digits = (0..9).toMutableList()
        var index = 999_999
        var result = 0L

        while (digits.size > 1) {
            val temp = factorial(digits.size - 1L).toInt()
            val i = index / temp
            index -= (i * temp)
            result = result * 10 + digits.removeAt(i)
        }
        return result * 10 + digits[0]
    }
}