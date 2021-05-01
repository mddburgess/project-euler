package dev.mikeburgess.euler.problems

/**
 * If p is the perimeter of a right angle triangle with integral length sides, {a,b,c}, there are
 * exactly three solutions for p = 120.
 *
 * {20,48,52}, {24,45,51}, {30,40,50}
 *
 * For which value of p ≤ 1000, is the number of solutions maximised?
 */
class Problem039 : Problem {

    override fun solve(): Long {
        var maxP = 0
        var maxSolutions = 0

        (2..1000 step 2).forEach { p ->
            val solutions = (2..p / 3)
                .map { p * (p - 2 * it) % (2 * (p - it)) }
                .count { it == 0 }

            if (solutions > maxSolutions) {
                maxSolutions = solutions
                maxP = p
            }
        }

        return maxP.toLong()
    }
}
