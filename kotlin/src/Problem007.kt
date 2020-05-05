import kotlin.math.sqrt

/**
 * Problem 7
 *
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is
 * 13.
 *
 * What is the 10,001st prime number?
 */
fun main() {
    val solution = generateSequence(3L, { it + 2 })
        .filter { it.isPrime() }
        .take(10_000)
        .last()
    println(solution)
}

fun Long.isPrime(): Boolean {
    val max = sqrt(this.toDouble())
    return generateSequence(3L, { it + 2 })
        .takeWhile { it <= max }
        .filter { this % it == 0L }
        .none()
}
