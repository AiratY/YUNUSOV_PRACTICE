package ru.yunusov.yunusov_practice.additionalTasks

import java.math.BigInteger
import java.security.MessageDigest

//https://www.codewars.com/kata/5efae11e2d12df00331f91a6

fun crack(hash: String): String {
    for(i in 0..99999){
        var pin = i.toString()
        if (pin.length < 5) {
            pin = pin.padStart(5,'0')
        }
        if (md5(pin) == hash){
            return pin
        }
    }
    return ""
}

fun md5(input:String): String {
    val md = MessageDigest.getInstance("MD5")
    return BigInteger(1, md.digest(input.toByteArray())).toString(16).padStart(32, '0')
}