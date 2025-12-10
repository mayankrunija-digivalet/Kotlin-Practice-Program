fun add(x: Int, y: Int): Int {
    return x + y
}

fun subtract(x: Int, y: Int) = x - y

// Function with default arguments
fun greet(name: String, greeting: String = "Hello") {
    println("$greeting, $name!")
}

fun main() {
    val sum = add(5, 3)
    val difference = subtract(10, 4)

    // Using default argument
    greet("User")

    // Overriding default argument
    greet("Admin", "Welcome")

    // Named arguments (can change order)
    greet(greeting = "Hi", name = "Guest")

    println("Sum: $sum, Difference: $difference")
}
