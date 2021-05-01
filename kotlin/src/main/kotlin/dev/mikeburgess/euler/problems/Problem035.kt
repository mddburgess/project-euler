package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.common.isEven
import dev.mikeburgess.euler.sequences.PrimeSequence
import dev.mikeburgess.euler.sequences.isPrime
import kotlin.math.floor
import kotlin.math.log10
import kotlin.math.pow

/**
 * The number 197 is called a circular prime because all rotations of the digits: 197, 971, and 719,
 * are themselves prime.
 *
 * There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.
 *
 * How many circular primes are there below one million?
 */
class Problem035 : Problem {

    private fun length(n: Long) =
        floor(log10(n.toDouble())).toInt() + 1

    private fun rotate(n: Long, length: Int) =
        (((n % 10) * (10f).pow(length)).toLong() + n) / 10

    private fun rotations(n: Long) =
        generateSequence(n) { rotate(it, length(n)) }
            .take(length(n))
            .toList()

    override fun solve(): Long {
        val isCircular = mutableMapOf(2L to true)
        val primes = PrimeSequence().takeWhile { it < 1_000_000 }.toList()

        for (prime in primes) {
            if (!isCircular.containsKey(prime)) {
                val rotations = rotations(prime)
                val isPrime = rotations.none(Long::isEven) && primes.containsAll(rotations)
                rotations.forEach { isCircular.putIfAbsent(it, isPrime) }
            }
        }

        return isCircular.filterValues { it }.count().toLong()
    }
}
