package common

import kotlin.math.sqrt

class PrimeNumberSequence : Sequence<Long> {

    private val primes: MutableList<Long> = ArrayList()

    override fun iterator(): Iterator<Long> = object : Iterator<Long> {

        private var next = 2L

        override fun hasNext(): Boolean = true

        override fun next(): Long {
            primes.add(next)
            next = calculateNext()
            return primes.last()
        }

        private fun calculateNext(): Long =
            generateSequence(next + 1) { it + 1 }
                .filter { isPrime(it) }
                .first()

        private fun isPrime(number: Long): Boolean {
            val max = sqrt(number.toDouble())
            return primes.asSequence()
                .takeWhile { it <= max }
                .none { number % it == 0L }
        }
    }
}
