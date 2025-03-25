package com.upwork.mobileappclass.classthree

fun main(){


    // Index       0,  1   , 2 ,   3 , 4
    //Elements     0,  10  ,  0 ,   0,  0
    //size 5

    var myArray=Array<Int>(6){0}

    myArray[1]=10
    myArray[4]=40
    myArray[5]=40
    for (item  in myArray){
        println(item)
    }
}