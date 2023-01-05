package ru.yunusov.yunusov_practice.certainTasks

fun maskify(input: String): String {
    val output = StringBuilder()
    input.forEachIndexed { index, c ->
        if (index < input.length - 4) {
            output.append('#')
        } else {
            output.append(c)
        }
    }
    return output.toString()
}