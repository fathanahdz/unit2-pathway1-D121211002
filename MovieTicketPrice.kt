fun main() {
    val child = 5
    val adult = 28
    val senior = 87
    
    val isMonday = true
    
    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    val childPrice = 15
    val standardPrice = if (isMonday) 25 else 30
    val seniorPrice = 20

    return when (age){
        in 0..12 -> childPrice
        in 13..60 -> standardPrice
        in 61..100 -> seniorPrice
        else -> -1
    }
    
}