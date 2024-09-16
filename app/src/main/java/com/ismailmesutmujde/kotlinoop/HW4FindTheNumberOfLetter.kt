package com.ismailmesutmujde.kotlinoop

class HW4FindTheNumberOfLetter {
    fun wordCount(word:String, letter:Char) {
        var result = 0

        for (w in word) {
            if (w == letter) {
                result = result + 1
            }
        }
        println("Letter Count : $result")
    }

}