// Extension function for the String class
fun String.exclaim(): String {
    return this.uppercase() + "!" // 'this' refers to the string instance
}

// Inline function
inline fun measureTime(block: () -> Unit) {
    val start = System.currentTimeMillis()
    block() // The lambda code is inlined here
    val end = System.currentTimeMillis()
    println("Time taken: ${end - start}ms")
}

fun main() {
    val greeting = "hello"
    // Calling the extension function
    println(greeting.exclaim()) // Output: HELLO!
    // Calling the inline function
    measureTime {
        var sum = 0L
        for (i in 1..100000) sum += i
         println("Sum: $sum")
    }
}