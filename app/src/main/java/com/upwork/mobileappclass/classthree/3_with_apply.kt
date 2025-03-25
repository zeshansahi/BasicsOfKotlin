package com.upwork.mobileappclass.classthree


fun main() {

    var person = Person();
//    person.name="Aun"
//    person.age=20

//    person.showPerson()

    with(person) {
        name = "Aun"
        age = 23
    }
    person.apply {
        name="Gr"
        age=21
    }.showPerson()
//    person.showPerson()


}

class Person() {

    var name: String = ""
    var age: Int = -1

    fun showPerson() {
        println("Name:$name and age:$age")
    }
}