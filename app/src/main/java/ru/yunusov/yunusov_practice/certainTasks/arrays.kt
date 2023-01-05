package ru.yunusov.yunusov_practice.certainTasks

fun equalSidesOfAnArray(array: IntArray): Int {
    for ((index, value) in array.withIndex()) {
        if (array.filterIndexed { index1, _ -> index1 < index }
                .sum() == array.filterIndexed { index1, _ -> index1 > index }.sum()){
            return index
        }
    }
    return -1
}