package com.upwork.mobileappclass



fun main(){

   val sum= addWithParam(10,20)

    println("Sum::$sum")

    val sum2= addWithParam(30,20)
    println("Sum::$sum2")

}

fun addWithParam(a:Int,b:Int):Int{

    val sum=a+b;
    return sum
}