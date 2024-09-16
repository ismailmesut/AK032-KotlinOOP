package com.ismailmesutmujde.kotlinoop

class HW6SalaryCalculation {

    fun salaryCalculation(numberOfDays : Int) : Int {
        val workingHours = numberOfDays * 8
        println("Working hours : $workingHours")

        var salary = 0

        if (workingHours >160) {
            val overtimeHours = workingHours - 160
            salary = 160 * 10 + overtimeHours * 20
        } else {
            salary = workingHours * 10
        }
        return salary
    }

}