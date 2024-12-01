package de.pochert.challenge.day_01.challenge_01

import de.pochert.challenge.utils.FileUtils

fun main() {
    val (list1, list2) = FileUtils.readTwoColumnFile("src/main/kotlin/day_01/data/data.txt", sort = true)
    val distances = list1.zip(list2) { a, b -> Challenge01().calculateDistanceBetween(a, b) }
    println("Total distance: ${distances.sum()}")
}

class Challenge01 {
    fun calculateDistanceBetween(valueA: Int, valueB: Int): Int {
        return kotlin.math.abs(valueA - valueB)
    }
}


