package dev.mikeburgess.euler.common

import java.nio.file.Path

fun getResourceAsText(resource: String) =
    Path.of("src", "main", "resources", resource)
        .toFile()
        .readText()

fun getResourceAsInts(resource: String) =
    getResourceAsText(resource)
        .lines()
        .filter { it.isNotBlank() }
        .map { it.split(' ').map(String::toInt) }
