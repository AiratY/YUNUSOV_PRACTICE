package ru.yunusov.yunusov_practice.additionalTasks

//https://www.codewars.com/kata/5ae62fcf252e66d44d00008e

fun expressionsMatter(a: Int, b: Int, c: Int): Int {
    val maxObtained = mutableListOf<Int>()

    maxObtained.add(a + b + c)
    maxObtained.add(a * b * c)
    maxObtained.add((a + b) * c)
    maxObtained.add(a * (b + c))
    return maxObtained.max()
}