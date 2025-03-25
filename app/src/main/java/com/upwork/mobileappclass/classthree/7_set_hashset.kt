package com.upwork.mobileappclass.classthree


fun main(){
//    var mySet= set<Int>(1,2,4,5,6,7,7,7,8,9)
//    var mySet= mutableSetOf<Int>(1,2,4,5,6,7,7,7,8,9)
    var mySet= hashSetOf<Int>(1,2,4,5,6,7,7,7,8,9)

    mySet.remove(9)
    mySet.add(19)

    for (item in mySet){
        println(item)
    }
}