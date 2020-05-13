package dev.mikeburgess.euler.common

import java.nio.file.Path

fun getResourceAsLines(resource: String) =
    Path.of("src", "main", "resources", resource)
        .toFile()
        .readLines()
        .filter { it.isNotBlank() }

fun getResourceAsInts(resource: String) =
    getResourceAsLines(resource)
        .map { it.split(' ').map(String::toInt) }
