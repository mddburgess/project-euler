package dev.mikeburgess.euler.common

import java.lang.Integer.max

class TriangleGraph(values: List<List<Int>>) {

    private val graph: List<List<Node>> =
        values.map { it.map { number -> Node(number) } }

    init {
        graph.mapIndexed { row, list ->
            list.mapIndexed { col, node ->
                if (row + 1 < graph.size) {
                    node.left = graph[row + 1][col]
                    node.right = graph[row + 1][col + 1]
                }
            }
        }
    }

    fun maxSum(): Int =
        graph[0][0].maxSum()

    private class Node(val rawValue: Int) {

        var calculatedValue: Int? = null
        var left: Node? = null
        var right: Node? = null

        fun maxSum(): Int =
            when {
                calculatedValue != null -> calculatedValue as Int
                else -> calculateValue().also { calculatedValue = it }
            }

        fun calculateValue(): Int =
            max(rawValue + (left?.maxSum() ?: 0), rawValue + (right?.maxSum() ?: 0))
    }
}
