package dev.charlesbadger.adventofcode2022

import dev.charlesbadger.adventofcode2022.challenge.Challenge
import dev.charlesbadger.adventofcode2022.challenge.Day1
import dev.charlesbadger.adventofcode2022.model.Solution


fun main() = listOf(
    Day1(),
).map(Challenge::solve)
    .map(Solution::toString)
    .forEach(::println)