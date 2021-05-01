package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.sequences.PrimeSequence
import dev.mikeburgess.euler.sequences.isPrime

class Problem037 : Problem {

    private fun isTruncatablePrime(prime: Long): Boolean {
        var div = 10
        while (div < prime) {
            if (!(prime % div).isPrime() || !(prime / div).isPrime()) {
                return false
            }
            div *= 10
        }
        return true
    }

    override fun solve(): Long =
        PrimeSequence()
            .dropWhile { it < 23 }
            .filter { isTruncatablePrime(it) }
            .take(11)
            .sum()
}
