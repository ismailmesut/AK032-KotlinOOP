package com.ismailmesutmujde.kotlinoop

class Calculator {
    fun sum(number1 : Int, number2 : Int) {
        println("Sum : ${number1 + number2}")
    }
    fun sum(number1 : Double, number2 : Int) {
        println("Sum : ${number1 + number2}")
    }
    fun sum(number1 : Int, number2 : Double) {
        println("Sum : ${number1 + number2}")
    }
    fun sum(number1 : Double, number2 : Double) {
        println("Sum : ${number1 + number2}")
    }
    fun sum(number1 : Int, number2 : Int, name : String) {
        println("The sum operation was done by $name. Result : ${number1 + number2}")
    }
}