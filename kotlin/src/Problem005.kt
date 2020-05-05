/**
 * Problem 5
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any
 * remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
fun main() {
    val solution = LongRange(1, 20).reduce(::lcm)
    println(solution)
}

fun lcm(x: Long, y: Long): Long = x * y / gcd(x, y)

fun gcd(x: Long, y: Long): Long = when (y) {
    0L -> x
    else -> gcd(y, x % y)
}
