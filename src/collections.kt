fun main() {
    // Array (Mutable)
    val numbersArray = arrayOf(1, 2, 3, 4, 5)
    numbersArray[0] = 10
    println("Array: ${numbersArray.joinToString()}")

    // List (Immutable/Read-only)
    val namesList = listOf("Alice", "Bob", "Charlie")
    println("List: $namesList")

    // Mutable List
    val mutableAges = mutableListOf(25, 30)
    mutableAges.add(35)
    println("Mutable List: $mutableAges")

    // Map (Immutable/Read-only)
    val codeMap = mapOf("US" to 1, "IN" to 91)
    println("Map: ${codeMap["IN"]}")

    // Set (Immutable/Read-only) - Note the uniqueness
    val uniqueSet = setOf(1, 2, 2, 3)
    println("Set: $uniqueSet") // Output: [1, 2, 3]
}