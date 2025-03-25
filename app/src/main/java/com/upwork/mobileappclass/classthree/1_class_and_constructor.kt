package com.upwork.mobileappclass.classthree


fun main(){

    var std=Student("Aun",10);
   println(std.id)
}

class Student(val name:String){
    var id:Int=-1
    init {
        println("init function called, and Cr Nam:$name")
    }

    constructor(n:String,rollNo: Int):this(n){
        this.id=rollNo;
    }
}