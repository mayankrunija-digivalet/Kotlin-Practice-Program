const val APP_NAME = "KotlinDemo" // Compile-time constant

fun main() {
    // 1. Mutable variable (var)
    var count: Int = 10
    count = 11 // OK, can be changed

    // 2. Immutable variable (val)
    val name: String = "Alice"
    // name = "Bob" // ERROR: Val cannot be reassigned

    // 3. Type inference (compiler guesses the type)
    val age = 30 // Inferred as Int
    var price = 9.99 // Inferred as Double

    println("App Name: $APP_NAME")
    println("Count (var): $count")
    println("Name (val): $name")
    println("Age: $age, Price: $price")
}