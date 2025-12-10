fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    // 1. map: Square each number
    val squared = numbers.map { it * it }
    println("Mapped (Squared): $squared")

    // 2. filter: Get only even numbers
    val evens = numbers.filter { it % 2 == 0 }
    println("Filtered (Evens): $evens")

    // 3. forEach: Print each item
    print("forEach: ")
    numbers.forEach { print("$it ") }
    println()

    // 4. fold: Sum starting from an initial value (10)
    // 10 + 1 + 2 + 3 + 4 + 5 + 6 = 31
    val sumFold = numbers.fold(10) { accumulator, number -> accumulator + number }
    println("Fold (Sum from 10): $sumFold")

    // 5. reduce: Sum starting with the first element
    // 1 + 2 + 3 + 4 + 5 + 6 = 21
    val sumReduce = numbers.reduce { accumulator, number -> accumulator + number }
    println("Reduce (Sum): $sumReduce")
}