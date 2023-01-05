package ru.yunusov.yunusov_practice.additionalTasks

//https://www.codewars.com/kata/5933a1f8552bc2750a0000ed

fun getNthEvenNumber(nth: Int): Int {
    var evenNumber = 0
    if (nth != 1) {
        for (i in 2..nth) {
            evenNumber += 2
        }
    }
    return evenNumber
}