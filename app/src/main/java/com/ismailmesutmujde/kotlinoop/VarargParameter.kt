package com.ismailmesutmujde.kotlinoop

fun main() {
    fun sum(vararg numbers : Int) : Int {
        var result = 0

        for (n in numbers) {
            result = result + n
        }
        return result
    }

    val s1 = sum(1,2,3,4,5,3,5,6,7,8)
    println("s1 : $s1")
}