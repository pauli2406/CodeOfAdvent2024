package de.pochert.challenge.day_01.challenge_02

import de.pochert.challenge.utils.FileUtils

fun main() {
    val (list1, list2) = FileUtils.readTwoColumnFile("src/main/kotlin/day_01/data/data.txt")
    val similarityScore = Challenge02().similarityScore(list1.sorted(), list2.sorted())
    println("Similarity score: $similarityScore")
}

class Challenge02 {
    fun similarityScore(list1: List<Int>, list2: List<Int>): Int {
        return list1.sumOf { value -> value * list2.count { it == value } }
    }
}
