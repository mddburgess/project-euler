package dev.mikeburgess.euler.problems

/**
 * Problem 31
 *
 * In the United Kingdom the currency is made up of pound (£) and pence (p). There are eight coins
 * in general circulation:
 *
 * 1p, 2p, 5p, 10p, 20p, 50p, £1 (100p), and £2 (200p).
 *
 * It is possible to make £2 in the following way:
 *
 * 1 × £1 + 1 × 50p + 2 × 20p + 1 × 5p + 1 × 2p + 3 × 1p
 *
 * How many different ways can £2 be made using any number of coins?
 */
class Problem031 : Problem {

    override fun solve(): Long =
        listOf(200)
            .flatMap { (0..it / 200).map { c -> it - 200 * c } }
            .flatMap { (0..it / 100).map { c -> it - 100 * c } }
            .flatMap { (0..it / 50).map { c -> it - 50 * c } }
            .flatMap { (0..it / 20).map { c -> it - 20 * c } }
            .flatMap { (0..it / 10).map { c -> it - 10 * c } }
            .flatMap { (0..it / 5).map { c -> it - 5 * c } }
            .flatMap { (0..it / 2).map { c -> it - 2 * c } }
            .count().toLong()
}
