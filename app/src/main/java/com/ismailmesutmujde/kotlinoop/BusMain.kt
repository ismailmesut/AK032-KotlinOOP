package com.ismailmesutmujde.kotlinoop

fun main() {

    val kamilKoc = Bus(50, "Bursa", "Ankara", 10)
    kamilKoc.getInfo()

    kamilKoc.capacity = 100
    kamilKoc.fromWhere = "İzmir"
    kamilKoc.toWhere = "İstanbul"
    kamilKoc.currentPassenger = 30

    kamilKoc.getInfo()

    kamilKoc.getPassenger(20)
    kamilKoc.getInfo()

    kamilKoc.dropOffPassenger(40)
    kamilKoc.getInfo()

    val busCompany = Bus(50,"Bursa","İzmit", 5)
    busCompany.getInfo()

    busCompany.getPassenger(10)
    busCompany.getInfo()
}