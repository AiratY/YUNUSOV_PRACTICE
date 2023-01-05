package ru.yunusov.yunusov_practice.certainTasks

fun createPhoneNumber(input: IntArray): String {
    return if (input.filter { it in 0..9 }.size == 10) {
        "(${input[0]}${input[1]}${input[2]}) ${input[3]}${input[4]}${input[5]}-${input[6]}${input[7]}${input[8]}${input[9]}"
    } else {
        "Не соответсвует условиям"
    }
}