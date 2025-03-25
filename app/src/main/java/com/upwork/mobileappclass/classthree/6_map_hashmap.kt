package com.upwork.mobileappclass.classthree

fun main() {
    var myMap= hashMapOf<Int,String>()

    myMap.put(20,"Gr")
    myMap.put(21,"Cr")
    myMap.put(22,"Aun")

    myMap.put(20,"Maryam")

    for (key in myMap.keys){
        println("Kay:$key Value:${myMap[key]}")
    }
}