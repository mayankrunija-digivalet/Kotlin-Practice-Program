// A HOF that takes a function (operation) and two integers
fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    // 1. Define a lambda (a function that adds)
    val addLambda: (Int, Int) -> Int = { x, y -> x + y }

    // 2. Pass the lambda to the HOF
    val result = performOperation(10, 5, addLambda)
    println("Result with stored lambda (10 + 5): $result")

    // 3. Pass a lambda directly (subtraction)
    val result2 = performOperation(10, 5, { x, y -> x - y })
    println("Result with inline lambda (10 - 5): $result2")

    // Trailing lambda syntax (if the lambda is the last argument)
    val result3 = performOperation(10, 5) { x, y -> x * y }
    println("Result with trailing lambda (10 * 5): $result3")
}