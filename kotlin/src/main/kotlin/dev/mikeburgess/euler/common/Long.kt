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

fun Long.isPandigital(): Boolean {
    var mask = 0
    var number = this
    var length = 0
    while (number > 0) {
        mask = mask or (1 shl (number % 10).toInt())
        number /= 10
        length++
    }
    return (mask + 2) == 1 shl (length + 1)
}
