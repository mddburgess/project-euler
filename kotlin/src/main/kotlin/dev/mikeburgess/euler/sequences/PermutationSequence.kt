package dev.mikeburgess.euler.sequences

import dev.mikeburgess.euler.common.isEven
import java.util.Collections.swap

fun <T> permutationsOf(vararg objects: T): Sequence<List<T>> =
    listOf(*objects).permutations()

fun <T> Iterable<T>.permutations(): Sequence<List<T>> =
    PermutationSequence(this)

private class PermutationSequence<T>(private val objects: Iterable<T>) : Sequence<List<T>> {

    override fun iterator(): Iterator<List<T>> = object : AbstractIterator<List<T>>() {

        val permutation = objects.toMutableList()
        val stack = Array(permutation.size) { 0 }
        var index = 0

        init {
            setNext(permutation.toList())
        }

        override fun computeNext() {
            while (index < permutation.size) {
                if (stack[index] < index) {
                    when {
                        index.isEven() -> swap(permutation, 0, index)
                        else -> swap(permutation, stack[index], index)
                    }
                    stack[index]++
                    index = 0
                    setNext(permutation.toList())
                    return
                } else {
                    stack[index] = 0
                    index++
                }
            }
            done()
        }
    }
}
