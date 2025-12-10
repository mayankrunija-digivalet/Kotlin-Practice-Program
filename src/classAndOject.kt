class Dog(val name: String, var age: Int) {
    fun bark() {
        println("$name says Woof!")
    }
}

fun main() {
    // Creating an object (instance of the class)
    val myDog = Dog("Buddy", 5)

    // Accessing properties
    println("My dog's name is ${myDog.name} and he is ${myDog.age} years old.")

    // Calling a method
    myDog.bark()

    // Changing a 'var' property
    myDog.age = 6
    println("Buddy is now ${myDog.age}.")
}