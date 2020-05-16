package dev.mikeburgess.euler.sequences

import kotlin.math.sqrt

class PrimeNumbers : Sequence<Long> {

    override fun iterator(): Iterator<Long> = object : Iterator<Long> {

        private var index = 0

        override fun hasNext() = true

        override fun next() =
            when {
                index < primes.size -> primes[index]
                else -> calculateNext()
            }.also { ++index }

        private fun calculateNext() =
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
        val primes: MutableList<Long> = mutableListOf(2, 3)
    }
}
