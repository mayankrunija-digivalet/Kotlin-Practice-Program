// Type Alias
typealias Age = Int
typealias Handler = (String) -> Unit
fun printValue(x: Any) { // Any is the root of Kotlin class hierarchy
    // Type checking with 'is'
    if (x is String) {
        // Smart cast: 'x' is automatically cast to String, allowing String functions
        println("The value is a String, length: ${x.length}")
    } else if (x is Int) {
        // Smart cast: 'x' is automatically cast to Int
        println("The value is an Int, doubled: ${x * 2}")
    }
}
fun processMessage(message: String, handler: Handler) {
    handler(message.uppercase())
}
fun main() {
    printValue("Hello Smart Cast")
    printValue(42)

    val userAge: Age = 25 // Using the type alias
    println("User Age: $userAge")

    val simpleHandler: Handler = { msg -> println("Handled: $msg") }
    processMessage("check", simpleHandler)
}