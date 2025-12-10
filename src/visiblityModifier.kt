// This file-level function is internal
internal fun logInternal(message: String) = println("Internal Log: $message")

open class MyClass {
    // Public is the default
    val publicProp = "Public"

    private val privateProp = "Private"
    protected val protectedProp = "Protected"

    fun displayProps() {
        println("Accessing private: $privateProp")
    }
}

class MySubClass : MyClass() {
    fun accessProtected() {
        // Can access protectedProp from the subclass
        println("Accessing protected from subclass: $protectedProp")
    }
}

fun main() {
    val obj = MyClass()
    println("Accessing public: ${obj.publicProp}")
    // println("Accessing private: ${obj.privateProp}") // ERROR: Cannot access private

    val subObj = MySubClass()
    subObj.accessProtected() // Accesses the protected property

    val subObj2 = MySubClass()
    subObj2.displayProps()// Accesses the private property

    logInternal("Called from main")
}