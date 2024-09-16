package com.ismailmesutmujde.kotlinoop

class Mathematic {

    fun sum(number1:Int, number2:Int) {
        val sum = number1 + number2
        println("Sum : $sum")
    }

    fun sub(number1:Double, number2:Double) : Double {
        return  number1 - number2
    }

    fun mul(number1:Int, number2:Int, name:String) {
        val result = number1 * number2
        println("The multiplication operation was done by $name. Result : $result")
    }

    fun div(number1:Double, number2:Double) : String {
        return "Divide : ${number1/number2}"
    }
}