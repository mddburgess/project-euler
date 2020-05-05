import common.PrimeNumberSequence

/**
 * Problem 10
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 */
fun main() {
    val solution = PrimeNumberSequence()
        .takeWhile { it < 2_000_000 }
        .sum()
    println(solution)
}
