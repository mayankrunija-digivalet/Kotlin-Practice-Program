fun main() {
    println("Enter the student's score:")

    // Read the input as a string, and convert it to an integer
    val score = readLine()?.toIntOrNull() ?: run {
        println("Invalid input. Please enter a valid number.")
        return // Exit the program if input is invalid
    }

    val grade = if (score >= 90) {
        "A" // The value returned if true
    } else if (score >= 80) {
        "B"
    } else {
        "C" // The value returned if false
    }

    println("The student's grade is: $grade")
}
