fun main() {
    var a = 10
    val b = 5

    // Arithmetic
    val sum = a + b
    val isZero = a % 2 == 0 // Relational
    println("Sum: $sum, Is a Even? $isZero")

    // Logical
    val c = true
    val d = false
    val result = c && (d || !d)
    println("Logical Result: $result")

    // Assignment
    a += 2 // Equivalent to a = a + 2
    println("a after += 2: $a")
}