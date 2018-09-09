package io.programming4food.meanmachine.models

class Sale {
    var date: String = ""
        get() = field
        set(value) { field = value }

    var amount: Double = 0.00
        get() = field
        set(value) { field = value }
}