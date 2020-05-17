package dev.mikeburgess.euler

import dev.mikeburgess.euler.problems.problems

fun main(args: Array<String>) {
    val n = args[0].toInt()
    println("Problem $n: ${problems[n]?.solve()}")
}
