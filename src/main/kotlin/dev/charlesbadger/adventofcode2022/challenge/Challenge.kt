package dev.charlesbadger.adventofcode2022.challenge

import dev.charlesbadger.adventofcode2022.model.Solution

interface Challenge {
    val adventDay: Int
    fun solve(): Solution
}