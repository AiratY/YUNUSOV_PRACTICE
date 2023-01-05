package ru.yunusov.yunusov_practice.additionalTasks

//https://www.codewars.com/kata/5fc4349ddb878a0017838d0f

fun redKnight(verticalPositionKnight: Int, horizontalPositionPawns: Int): List<Any> {
    var horizontalPositionKnight = 0
    var verticalPositionKnight = verticalPositionKnight
    var horizontalPositionPawns = horizontalPositionPawns

    while (true) {
        horizontalPositionPawns++
        horizontalPositionKnight += 2
        verticalPositionKnight = if (verticalPositionKnight == 0) {
            1
        } else {
            0
        }
        if (horizontalPositionPawns == horizontalPositionKnight) {
            val pawns = if (verticalPositionKnight == 0) "white" else "black"
            return listOf<Any>(pawns, horizontalPositionPawns)
        }
    }
}