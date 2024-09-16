package com.ismailmesutmujde.kotlinoop

fun main() {
    /*
    val bmw = Car()
    println(bmw.color)
    println(bmw.velocity)
    println(bmw.isRunning)

    bmw.color = "white"
    bmw.velocity = 99
    bmw.isWorking = true
    println(bmw.color)
    println(bmw.velocity)
    println(bmw.isRunning)

     */

    val bmw = Car("red", 10,false)

    bmw.getInfo()

    bmw.color = "white"
    bmw.velocity = 900
    bmw.isRunning = true

    bmw.getInfo()

    bmw.stop()
    bmw.getInfo()

    bmw.run()
    bmw.getInfo()

    bmw.speedUp(100)
    bmw.speedUp(30)
    bmw.getInfo()

    bmw.speedDown(50)
    bmw.getInfo()

    val sahin = Car("yellow", 100, true)
    sahin.getInfo()

    sahin.speedUp(100)
    sahin.getInfo()

    sahin.stop()
    sahin.getInfo()
}