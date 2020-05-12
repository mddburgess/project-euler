package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.Problem
import dev.mikeburgess.euler.common.IntToWordFormatter

class Problem017 : Problem {

    private fun Int.toWords(): String =
        IntToWordFormatter().format(this)

    private fun String.countLetters(): Int =
        this.toCharArray()
            .count { it in 'a'..'z' }

    override fun solve(): Long =
        (1..1000).map { it.toWords() }
            .map { it.countLetters() }
            .sum()
            .toLong()
}
