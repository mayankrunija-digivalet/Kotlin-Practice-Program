fun main() {
    // Immutable Variable
    val name = "Kotlin"
    // name = "Java" // ERROR

    // Mutable Variable
    var count = 5
    count = 6 // OK

    // Immutable (Read-only) List
    val readOnlyList = listOf("Apple", "Banana")
    // readOnlyList.add("Orange") // ERROR: list does not have an 'add' method

    // Mutable List
    val mutableList = mutableListOf("Red", "Green")
    println(mutableList)

    mutableList.add("Blue") // OK
    mutableList[0] = "Crimson" // OK

    println("Mutable List: $mutableList")
    println("Immutable List: $readOnlyList")
}