// Infix extension function for Int
infix fun Int.powerOf(exponent: Int): Long {
    var result = 1L
    for (i in 1..exponent) {
        result *= this
    }
    return result
}

fun main() {
    // Normal function call
    val result1 = 2.powerOf(3)

    // Infix notation (reads naturally)
    val result2 = 2 powerOf 4 // 2 to the power of 4

    println("2 powerOf 3: $result1")
    println("2 powerOf 4: $result2")
}