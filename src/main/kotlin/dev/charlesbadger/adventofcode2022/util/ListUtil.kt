package dev.charlesbadger.adventofcode2022.util

fun List<Long>.lastElementPlus(number: Long) = takeUnless { isEmpty() }?.mapIndexed { index, l ->
    takeIf { index == lastIndex }?.let { l + number } ?: l
} ?: throw IndexOutOfBoundsException("No element to add to, list is empty")