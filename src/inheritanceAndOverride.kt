open class Animal(val name: String) { // Must be 'open' to be inherited
    open fun sound() { // Must be 'open' to be overridden
        println("$name makes a generic sound.")
    }
}
class Cat(name: String, val breed: String) : Animal(name) {
    override fun sound() { // Must use 'override'
        println("$name the $breed says hello!")
    }
    fun walk() {
        println("$name is walking.")
    }
}

fun main() {
    val myCat = Cat("Whisky", "cat")
    myCat.sound() // Calls the overridden method
    myCat.walk()

    val myDog = Cat("Shalow", "dog")
    myDog.sound() // Polymorphism in action
    myDog.walk()

    val myCat2 = Animal("Whisky")
    myCat2.sound()
    val myDog2 = Animal("Shalow")
    myDog2.sound()


}