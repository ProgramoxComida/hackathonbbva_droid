package io.programming4food.meanmachine.models

class Product {
    var name: String = ""
        get() = field
        set(value){ field = value }

    var description: String = ""
        get() = field
        set(value){ field = value }

    var price: Double = 0.00
        get() = field
        set(value){ field = value }
}