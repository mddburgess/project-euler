package dev.mikeburgess.euler.problems

import dev.mikeburgess.euler.Problem
import java.math.BigInteger

class Problem025 : Problem {

    override fun solve(): Long {
        var index = 2L
        var fibonacci = BigInteger.valueOf(1) to BigInteger.valueOf(1)
        while (fibonacci.second < BigInteger.TEN.pow(999)) {
            fibonacci = fibonacci.second to fibonacci.first + fibonacci.second
            index++
        }
        return index
    }
}
