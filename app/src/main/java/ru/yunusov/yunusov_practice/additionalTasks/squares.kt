package ru.yunusov.yunusov_practice.additionalTasks

import kotlin.math.sqrt

//https://www.codewars.com/kata/60908bc1d5811f0025474291

fun findTheSquares(difference: Int): String {
    for (i in 1..1000000) {
        val smaller = i*i
        val bigger = smaller + difference
        if (sqrt(bigger.toFloat()) % 1 == 0.0F) {
            return "$bigger-$smaller"
        }
    }
    return "не получилось"
}