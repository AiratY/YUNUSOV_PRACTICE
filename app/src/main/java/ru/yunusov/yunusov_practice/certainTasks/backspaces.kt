package ru.yunusov.yunusov_practice.certainTasks

fun backspacesInString(input: String): String {
    val output = StringBuilder()
    input.forEachIndexed { index, c ->
        if (c == '#') {
            if (output.isNotEmpty()) {
                output.deleteAt(output.length - 1)
            }
        } else {
            output.append(c)
        }
    }
    return output.toString()
}