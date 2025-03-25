package com.upwork.mobileappclass.classthree

fun main(){

    var std1=Student1("Aun",20)
    var std2=Student1("Aun",20)

    if (std1==std2){
        println("Objects are equal==")
    }else
    {
        println("Objects are not equal")
    }

    var std3=std2.copy(rollNo = 30, name = "New Student")

    println("Std1==$std1")
    println("Std1==$std2")
    println("Std3==$std3")
}

data class Student1(var name:String,var rollNo:Int)