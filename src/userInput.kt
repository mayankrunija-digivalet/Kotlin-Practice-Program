fun main() {
    print("Enter your name: ")
    val name = readLine()
    println(name)
    print("Enter your age: ")
    val age = readLine()!!.toInt()

    var integerValue: Int = age
    println("You entered: $integerValue")
}

