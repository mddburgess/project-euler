package dev.mikeburgess.euler.sequences

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

        private fun isPrime(n: Long) =
            primes.asSequence()
                .takeWhile { it <= sqrt(n.toDouble()) }
                .none { n % it == 0L }
    }

    companion object {
        private val primes: MutableList<Long> = mutableListOf(2, 3)
    }
}

fun Long.isPrime(): Boolean = when {
    this < 2L -> false
    else -> PrimeSequence().takeWhile { it <= this }.last() == this
}
