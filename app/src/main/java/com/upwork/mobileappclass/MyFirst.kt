package com.upwork.mobileappclass


fun main() {


/*
    when (a) {
        in 0..10 -> println("Value in between 0-10")
        20 -> println("value is 20")
        else -> println("I don't know the value")
    }
*/
    val a = 10
    val b = 20


    val str=  when (a) {
        in 0..10 -> {
            println("value is in range")
            "Value in between 0-10"
        }
        20 -> {
            "value is 20"
        }
        else -> {
            "I don't know the value"
        }
    }
    println(str)
}

