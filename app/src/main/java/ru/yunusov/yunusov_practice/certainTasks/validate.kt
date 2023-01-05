package ru.yunusov.yunusov_practice.certainTasks

fun simpleValidationOfUsernameWithRegex(input: String): Boolean {
    return input.length in 4..20 && input.filter { it == '_'|| (it.isLetter() && it.isLowerCase()) || it.isDigit()}.length == input.length
}