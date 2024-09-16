package com.ismailmesutmujde.kotlinoop

class HW3FactorialCalculation {

    fun factorialCalculation(number:Int) : Int {
        var result = 1

        for (i in 1..number) {
            result = result * i
        }
        return result
    }
}