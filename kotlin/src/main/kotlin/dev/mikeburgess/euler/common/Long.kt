package dev.mikeburgess.euler.common

fun lcm(x: Long, y: Long): Long = x * y / gcd(x, y)

fun gcd(x: Long, y: Long): Long = when (y) {
    0L -> x
    else -> gcd(y, x % y)
}

fun Long.isEven() = this % 2 == 0L

fun Long.isPalindrome(base: Long = 10): Boolean {
    var temp = this
    var reverse = 0L
    while (temp > 0) {
        reverse = reverse * base + (temp % base)
        temp /= base
    }
    return this == reverse
}
