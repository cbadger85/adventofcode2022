package dev.charlesbadger.adventofcode2022.util

fun String.trimToNull(): String? = trim().takeUnless { it.isEmpty() }