package com.upwork.mobileappclass.classthree

fun main() {

//    var list=ArrayList<String>()
//    var list= arrayListOf<String>()
    var list= mutableListOf<String>()

    list.add("Aun")
    list.add("Maryam")
    list.add("Gr")

    list[2]="CR"
    for (item in list){
        println(item)
    }
}