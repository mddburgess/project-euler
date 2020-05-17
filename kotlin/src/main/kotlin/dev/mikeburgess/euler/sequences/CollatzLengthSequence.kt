package dev.mikeburgess.euler.sequences

@OEIS("A006577")
class CollatzLengthSequence : Sequence<Long> {

    override fun iterator(): Iterator<Long> = object : Iterator<Long> {

        var nextNumber = 1L

        override fun hasNext() = true

        override fun next() = computeCollatzLength(nextNumber++)

        private fun computeCollatzLength(n: Long): Long {
            if (collatzLength[n] == null) {
                collatzLength[n] = when (n % 2) {
                    0L -> 1 + computeCollatzLength(n / 2)
                    else -> 2 + computeCollatzLength((3 * n + 1) / 2)
                }
            }
            return collatzLength[n]!!
        }
    }

    companion object {
        private var collatzLength = mutableMapOf(1L to 0L)
    }
}
