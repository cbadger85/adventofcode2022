package dev.charlesbadger.adventofcode2022.challenge

import dev.charlesbadger.adventofcode2022.model.Solution
import dev.charlesbadger.adventofcode2022.util.getResourcesStream
import dev.charlesbadger.adventofcode2022.util.lastElementPlus
import dev.charlesbadger.adventofcode2022.util.trimToNull
import java.io.InputStream

class Day1 : Challenge {
    override val adventDay = 1

    // read the text file line-by-line, converting the calories to longs, and the line returns to null.
    // iterate over the list of calories, adding each calorie to the last element of the list if the element is
    // not null. If the calorie is null, add a new element to the list with a value of zero.
    private fun readDataStream(stream: InputStream) = stream.bufferedReader().useLines { sequence ->
        sequence.map { it.trimToNull()?.toLong() }
            .fold(listOf<Long>(0)) { listOfCalorieSums, currentCalorie ->
                currentCalorie?.let { calorie -> listOfCalorieSums.lastElementPlus(calorie) } ?: (listOfCalorieSums + 0)
            }
    }

    private fun mostCaloriesSum(data: List<Long>) = data.maxOf { it }

    private fun highestThreeCaloriesSum(data: List<Long>) = data.sortedDescending()
        .subList(0, 3)
        .sum()

    override fun solve() = getResourcesStream("/day1.txt").let(::readDataStream)
        .let {
            Solution(
                adventDay = adventDay,
                solution1 = mostCaloriesSum(it),
                solution2 = highestThreeCaloriesSum(it)
            )
        }
}
