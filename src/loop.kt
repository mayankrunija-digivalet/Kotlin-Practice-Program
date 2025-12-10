fun main() {
    val items = listOf("Pen", "Pencil", "Eraser")

    // 1. For loop over a collection
    for (item in items) {
        println("Item: $item")
    }

    // 2. While loop
    var counter = 0
    while (counter < 3) {
        print("$counter ")
        counter++
    }
    println()

    // 3. Do-While loop (always runs at least once)
    var x = 0
    do {
        println("Do-While ran once.")
        x++
    } while (x < 0) // Condition is false, but it ran once
}