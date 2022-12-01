package dev.charlesbadger.adventofcode2022.model

data class Solution(
    val adventDay: Int,
    val solution1: Any,
    val solution2: Any
) {
    override fun toString() = """
        -------------------------
        Day $adventDay
        -------------------------
        Solution 1: $solution1
        Solution 2: $solution2
            
        """.trimIndent()
}
