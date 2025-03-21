package com.upwork.mobileappclass



fun main(){
   myLoop@ for (i in 1..5){
        for(j in 1 ..5){
            if (i==2&&j==2){
                continue
            }
            println("$i $j")

        }
    }
}