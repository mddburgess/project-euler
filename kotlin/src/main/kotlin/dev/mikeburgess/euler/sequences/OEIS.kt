package dev.mikeburgess.euler.sequences

import kotlin.annotation.AnnotationRetention.SOURCE
import kotlin.annotation.AnnotationTarget.CLASS
import kotlin.annotation.AnnotationTarget.FUNCTION

@Target(CLASS, FUNCTION)
@Retention(SOURCE)
annotation class OEIS(val sequence: String)
