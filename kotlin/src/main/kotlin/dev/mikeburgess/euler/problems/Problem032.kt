package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.common.permutations

/**
 * Problem 32
 *
 * We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n
 * exactly once; for example, the 5-digit number, 15234, is 1 through 5 pandigital.
 *
 * The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing multiplicand,
 * multiplier, and product is 1 through 9 pandigital.
 *
 * Find the sum of all products whose multiplicand/multiplier/product identity can be written as a
 * 1 through 9 pandigital.
 *
 * HINT: Some products can be obtained in more than one way so be sure to only include it once in
 * your sum.
 */
class Problem032 : Problem {

    private fun List<Int>.toInt() =
        reduce { a, b -> a * 10 + b }

    private fun candidateProducts(digits: List<Int>): Pair<Int, Int> {
        val candidate1 = digits[0] * digits.subList(1, 5).toInt()
        val candidate2 = digits.subList(0, 2).toInt() * digits.subList(2, 5).toInt()
        return candidate1 to candidate2
    }

    private operator fun <T> Pair<T, T>.contains(other: T) =
        first == other || second == other

    override fun solve(): Long =
        listOf(1, 2, 3, 4, 5, 6, 7, 8, 9).permutations()
            .map { it.subList(0, 4).toInt() to candidateProducts(it.subList(4, 9)) }
            .filter { (product, candidates) -> product in candidates }
            .map { it.first }
            .distinct()
            .sum().toLong()
}


