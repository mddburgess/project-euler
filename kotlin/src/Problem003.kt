/**
 * Problem 3
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143?
 */
fun main() {
    var number = 600_851_475_143
    var factor = 2

    while (factor < number) {
        when {
            number % factor == 0L -> number /= factor
            else -> factor++
        }
    }

    println(factor)
}
