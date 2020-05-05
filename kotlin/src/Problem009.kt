/**
 * Problem 9
 *
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 * a^2 + b^2 = c^2
 *
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
fun main() {
    val triplet = LongRange(1, 332)
        .flatMap { a -> LongRange(a + 1, (1000 - a) / 2).map { b -> a to b } }
        .map { ab -> Triple(ab.first, ab.second, 1000 - ab.first - ab.second) }
        .first { it.isPythagorean() }

    val solution = triplet.first * triplet.second * triplet.third
    println(solution)
}

fun Triple<Long, Long, Long>.isPythagorean(): Boolean =
    first * first + second * second == third * third
