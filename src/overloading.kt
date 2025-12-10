// Function that adds two Ints
fun calculate(a: Int, b: Int): Int = a + b

// Overloaded function that adds two Doubles
fun calculate(a: Double, b: Double): Double = a + b

// Overloaded function that takes three Ints
fun calculate(a: Int, b: Int, c: Int): Int = a + b + c

fun main() {
    val sumInt = calculate(5, 10)
    val sumDouble = calculate(5.5, 10.5)
    val sumThree = calculate(1, 2, 3)

    println("Int Sum: $sumInt, Double Sum: $sumDouble, Three Int Sum: $sumThree")
}