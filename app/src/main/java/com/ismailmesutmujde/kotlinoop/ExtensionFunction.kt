package com.ismailmesutmujde.kotlinoop


fun main() {

    /*
    fun Int.mul(number:Int):Int {
        return this * number
    }
    */
    infix fun Int.mul(number:Int):Int {
        return this * number
    }

    //val result = 5.mul(2)
    val result = 5 mul 2
    println(result)
}