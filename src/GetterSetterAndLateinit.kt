class Person(val firstName: String, private var _age: Int) { // Primary Constructor

    // Secondary Constructor (must delegate to the primary constructor using 'this')
    constructor(firstName: String) : this(firstName, 0)

    // Custom Getter/Setter for the 'age' property
    var age: Int
        get() = _age // Custom Getter
        set(value) {
            if (value >= 0) {
                _age = value
            } else {
                println("Age cannot be negative.")
            }
        }

    // lateinit property
    lateinit var info: String

    init {
        // Initialization block for the primary constructor
        println("A Person object for $firstName is created.")
    }
}

fun main() {
    val p1 = Person("Alex", 30) // Primary constructor

    // Using the custom setter
    p1.age = 31
    println("Alex's age (using custom getter): ${p1.age}")

    // Using lateinit
    p1.info = "Updated!"
    println("Lateinit info: ${p1.info}")

    val p2 = Person("Ben") // Secondary constructor
    println("Ben's age: ${p2.age}")
}