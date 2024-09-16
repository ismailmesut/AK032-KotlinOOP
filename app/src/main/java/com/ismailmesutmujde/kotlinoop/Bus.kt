package com.ismailmesutmujde.kotlinoop

class Bus (var capacity : Int, var fromWhere: String, var toWhere : String, var currentPassenger : Int) {

    fun getPassenger(passenger : Int) {
        currentPassenger = currentPassenger + passenger
    }

    fun dropOffPassenger(passenger: Int) {
        currentPassenger = currentPassenger - passenger
    }
    fun getInfo() {
        println("Capacity          : $capacity")
        println("FromWhere         : $fromWhere")
        println("ToWhere           : $toWhere")
        println("Current Passenger : $currentPassenger")
        println("*************************************")
    }
}