package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.Problem
import dev.mikeburgess.euler.common.getResourceAsLines

/**
 * Problem 22
 *
 * Using a text file containing over five-thousand first names, begin by sorting it into
 * alphabetical order. Then working out the alphabetical value for each name, multiply this value by
 * its alphabetical position in the list to obtain a name score.
 *
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth
 * 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of
 * 938 × 53 = 49714.
 *
 * What is the total of all the name scores in the file?
 */
class Problem022 : Problem {

    private fun String.wordScore(): Int =
        toCharArray().sumBy { it - '@' }

    override fun solve(): Long =
        getResourceAsLines("Problem022.txt")
            .sorted()
            .mapIndexed { index, s -> (index + 1L) * s.wordScore() }
            .sum()
}
