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
                .filter { it.isPrime() }
                .first()
                .also { primes.add(it) }

        private fun Long.isPrime() =
            primes.asSequence()
                .takeWhile { it <= sqrt(this.toDouble()) }
                .none { this % it == 0L }
    }

    companion object {
        private val primes: MutableList<Long> = mutableListOf(2, 3)
    }
}
