package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.Problem
import dev.mikeburgess.euler.common.getResourceAsLines

class Problem022 : Problem {

    private fun String.wordScore(): Int =
        toCharArray().sumBy { it - '@' }

    override fun solve(): Long =
        getResourceAsLines("Problem022.txt")
            .sorted()
            .mapIndexed { index, s -> (index + 1L) * s.wordScore() }
            .sum()
}
