
package de.pochert.challenge.utils

import java.io.File

object FileUtils {
    fun readTwoColumnFile(filePath: String, sort: Boolean = false): Pair<List<Int>, List<Int>> {
        val list1 = mutableListOf<Int>()
        val list2 = mutableListOf<Int>()
        File(filePath).forEachLine { line ->
            val (left, right) = line.split("\\s+".toRegex()).map { it.toInt() }
            list1.add(left)
            list2.add(right)
        }
        if (sort) {
            return Pair(list1.sorted(), list2.sorted())
        }
        return Pair(list1, list2)
    }
}
