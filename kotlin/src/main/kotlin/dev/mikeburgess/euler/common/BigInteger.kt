package dev.mikeburgess.euler.common

import java.math.BigInteger

fun factorial(n: Long): BigInteger =
    (1..n).map(BigInteger::valueOf).reduce(BigInteger::times)

fun BigInteger.sumDigits() =
    this.toString()
        .toCharArray()
        .map { it - '0' }
        .sum()
