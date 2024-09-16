package com.ismailmesutmujde.kotlinoop

fun main() {
    val m = Mathematic()
    m.sum(100,200)

    val s = m.sub(300.0, 50.0)
    println(s)

    m.mul(20,5, "ismail")

    val data = m.div(100.0, 2.0)
    println(data)
}