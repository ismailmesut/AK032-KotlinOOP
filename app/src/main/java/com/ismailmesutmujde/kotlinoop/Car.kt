package com.ismailmesutmujde.kotlinoop

class Car (var color : String, var velocity : Int, var isRunning : Boolean) {

    //lateinit var sayi : Int
    fun run() {
        isRunning = true
    }

    fun stop() {
        isRunning = false
        velocity = 0
    }

    fun speedUp(HowManyKm : Int) {
        velocity = velocity + HowManyKm
    }

    fun speedDown(HowManyKm : Int) {
        velocity = velocity - HowManyKm
    }

    fun getInfo() {
        println("Color     : $color")
        println("Velocity  : $velocity")
        println("IsWorking : $isRunning")
    }
}