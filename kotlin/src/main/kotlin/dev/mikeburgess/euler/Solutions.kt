package dev.mikeburgess.euler

import dev.mikeburgess.euler.problems.*

@Suppress("EnumEntryName", "unused")
enum class Solutions(val problem: Problem, val answer: Long) {

    `Problem 001`(Problem001(), 233_168),
    `Problem 002`(Problem002(), 4_613_732),
    `Problem 003`(Problem003(), 6_857),
    `Problem 004`(Problem004(), 906_609),
    `Problem 005`(Problem005(), 232_792_560),
    `Problem 006`(Problem006(), 25_164_150),
    `Problem 007`(Problem007(), 104_743),
    `Problem 008`(Problem008(), 23_514_624_000),
    `Problem 009`(Problem009(), 31_875_000),
    `Problem 010`(Problem010(), 142_913_828_922)
}
