package dev.mikeburgess.euler.sequences

import dev.mikeburgess.euler.common.isEven
import kotlin.math.sqrt

@OEIS("A000040")
class PrimeSequence : Sequence<Long> {

    override fun iterator(): Iterator<Long> = object : Iterator<Long> {

        private var index = 0

        override fun hasNext() = true

        override fun next() =
            when {
                index < primes.size -> primes[index]
                else -> computeNext()
            }.also { ++index }

        private fun computeNext() =
            generateSequence(primes.last() + 2) { it + 2 }
                .filter { isPrime(it) }
                .first()
                .also { primes.add(it) }
                .also { primeSet.add(it) }

        private fun isPrime(n: Long) =
            primes.asSequence()
                .takeWhile { it <= sqrt(n.toDouble()) }
                .none { n % it == 0L }
    }

    companion object {
        val primes = mutableListOf(2L, 3L)
        val primeSet = mutableSetOf(2L, 3L)
    }
}

fun Long.isPrime(): Boolean = when {
    this <= PrimeSequence.primes.last() -> PrimeSequence.primeSet.contains(this)
    else -> PrimeSequence().takeWhile { it <= this }.last() == this
}
