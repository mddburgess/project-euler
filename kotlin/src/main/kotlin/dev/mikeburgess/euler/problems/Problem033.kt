package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.common.gcd

/**
 * Problem 33
 *
 * The fraction 49/98 is a curious fraction, as an inexperienced mathematician in attempting to
 * simplify it may incorrectly believe that 49/98 = 4/8, which is correct, is obtained by
 * cancelling the 9s.
 *
 * We shall consider fractions like, 30/50 = 3/5, to be trivial examples.
 *
 * There are exactly four non-trivial examples of this type of fraction, less than one in value,
 * and containing two digits in the numerator and denominator.
 *
 * If the product of these four fractions is given in its lowest common terms, find the value of
 * the denominator.
 */
class Problem033 : Problem {

    override fun solve(): Long {
        var numProduct = 1L
        var denProduct = 1L
        for (i in 1..9) {
            for (den in 1..9) {
                for (num in 1 until den) {
                    if (den * (10 * num + i) == num * (10 * i + den)) {
                        numProduct *= num
                        denProduct *= den
                    }
                }
            }
        }
        return denProduct / gcd(numProduct, denProduct)
    }
}
