package dev.mikeburgess.euler.common

class Grid(private vararg val values: Array<Long>) {

    private val height = values.size
    private val width = values[0].size

    operator fun get(row: Int, col: Int): Long =
        when {
            row < 0 || row >= height -> 0L
            col < 0 || col >= width -> 0L
            else -> values[row][col]
        }

    fun transform(f: (Grid, Int, Int) -> Long): Grid {
        val transformedValues = Array(height) { Array(width) { 0L } }
        values.indices.forEach { row ->
            values[row].indices.forEach { col ->
                transformedValues[row][col] = f(this, row, col)
            }
        }
        return Grid(*transformedValues)
    }

    fun max(): Long? =
        values.mapNotNull { it.max() }
            .max()
}
