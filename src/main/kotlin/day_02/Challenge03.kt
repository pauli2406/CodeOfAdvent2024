package de.pochert.challenge.day_02

import de.pochert.challenge.utils.FileUtils
import kotlin.math.abs

fun main() {
    val list = FileUtils.readNumberRows("src/main/kotlin/day_02/data/data.txt")
    // How many input lists are valid?
    println(list.map { Challenge03().isReportValid(it) }
        .count { it })
}

class Challenge03 {
    fun isReportValid(list: List<Int>): Boolean {
        if (list.size < 2) return true

        val firstDiff = list[1] - list[0]
        val isIncreasing = firstDiff > 0

        for (i in 0 until list.size - 1) {
            val diff = list[i + 1] - list[i]

            // Check if difference is between 1 and 3
            if (abs(diff) !in 1..3) return false

            // Check if direction remains consistent
            if ((isIncreasing && diff <= 0) || (!isIncreasing && diff >= 0)) return false
        }

        return true
    }
}
