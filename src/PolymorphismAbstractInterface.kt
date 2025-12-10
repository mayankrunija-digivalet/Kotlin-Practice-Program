// Abstract Class
abstract class Shape(val name: String) {
    abstract fun area(): Double // Abstract method
    fun description() = println("This is a $name.")
}

// Interface
interface Drawable {
    fun draw() // Abstract function
    fun erase() = println("Erasing the drawing.") // Default implementation
}

class Circle(radius: Double) : Shape("Circle"), Drawable {
    private val r = radius
    override fun area(): Double = Math.PI * r * r
    override fun draw() {
        println("Drawing a circle of radius $r.")
    }
}

fun main() {
    val myCircle = Circle(5.0)
    myCircle.description()
    println("Area: ${myCircle.area()}")
    myCircle.draw()
    myCircle.erase()

    val drawable: Drawable = myCircle // Polymorphism with interface
    drawable.draw()
}