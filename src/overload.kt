fun main(){
    // Function with two Int parameters and an Int return type
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    // Single-expression function (return type can often be inferred)
    fun sum(a: Int, b: Int, c: Int) = a * b + c


    val result = sum(5, 3)
    val res = sum(5, 3, c = 5)// result is 8
    println("result = $result")
    println("result = $res")

}