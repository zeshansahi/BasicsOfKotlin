package com.upwork.mobileappclass


fun main(){

   myLoop1@ for (i in 1..5){
        for (j in 1 .. 5){
            println("$i $j")
            if (i==2&&j==2){
                break@myLoop1
            }
        }
    }
}