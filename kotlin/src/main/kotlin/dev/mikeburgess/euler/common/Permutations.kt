package dev.mikeburgess.euler.common

import java.util.Collections.swap

fun <T> List<T>.permutations(): List<List<T>> =
    toList().permutations(size, mutableListOf())

private fun <T> List<T>.permutations(k: Int, result: MutableList<List<T>>): List<List<T>> {
    if (k == 1) {
        result.add(toList())
    } else {
        permutations(k - 1, result)
        for (i in 0 until k - 1) {
            when {
                k.isEven() -> swap(this, i, k - 1)
                else -> swap(this, 0, k - 1)
            }
            permutations(k - 1, result)
        }
    }
    return result
}
