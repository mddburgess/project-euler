/**
 * Problem 4
 *
 * A palindromic number reads the same both ways. The largest palindrome made from the product of
 * two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
fun main() {
    val solution = IntRange(100, 999)
        .associateWith { IntRange(it, 999) }
        .flatMap { entry -> entry.value.map { entry.key * it } }
        .filter { it.isPalindrome() }
        .max()
    println(solution)
}

fun Int.isPalindrome(): Boolean {
    var temp = this
    var reverse = 0

    while (temp > 0) {
        val remainder = temp % 10
        reverse = reverse * 10 + remainder
        temp /= 10
    }

    return this == reverse
}
