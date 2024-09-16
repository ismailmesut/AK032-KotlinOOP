package com.ismailmesutmujde.kotlinoop

fun main() {

    // geriye değer döndürmeyen fonksiyon
    fun greeting() {
        val result = "Merhaba İsmail"
        println(result)
    }
    greeting()

    // geriye değer döndüren fonksiyon
    fun greeting2() : String {
        val result = "Merhaba Mesut"
        return result
    }
    val incomingResult = greeting2()
    println(incomingResult)

    // parametre alan ve geriye değer döndürmeyen fonksiyon
    fun greeting3(name : String) {
        val result = "Merhaba $name"
        println(result)
    }
    greeting3("İsmail Mesut")

    // geriye değer döndürmeyen fonksiyon
    fun sum() {
        val sum = 30 + 40
        println("Sum : $sum")
    }
    sum()

    // geriye değer döndüren fonksiyon
    fun sum2() : Int {
        val sum = 30 + 90
        return sum
    }
    val s2 = sum2()
    println("s2 : $s2")

    // parametre alan ve geriye değer döndüren fonksiyon
    fun sum3(number1 : Int, number2 : Int) : Int {
        val sum = number1 + number2
        return sum
    }
    val s3 = sum3(100,200)
    println("s3 : $s3")
}