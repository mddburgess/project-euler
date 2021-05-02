package dev.mikeburgess.euler.common

val String.wordScore: Int
    get() = toCharArray().sumBy { it - '@' }
