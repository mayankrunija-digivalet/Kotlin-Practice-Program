/* open class Animal{
    fun walk(name: String){
        println("$name is walking")
    }
    fun walk(name: String,age : Int){
        println("name is $name, and age is $age (its overloading)")
    }
}
class Cat : Animal(){
    fun sound(){
        println("mewoooo")
    }
    fun walk(){
        println("overriding is running")
    }
}
fun main() {
    val obj = Animal()
    obj.walk("dog")
    obj.walk("tom",4)
    
    val obj1 = Cat()
    obj1.sound()
    obj1.walk("cat")
    obj1.walk()
} */

/*
 fun main(){
     val items = listOf("apple","banana","cherry")
     //items.add("mango")
     println(items)
     
     val lists = mutableListOf("apple","banana","cherry")
     lists.add("mango")
     println(lists)
     
 for(i in items){
     if(i== "apple"){
         println("found apple")
     }
     else{
         println("nothing found")
     }
     println(i)
     
 }
 }
 */


/*fun main(){
     var i = 1
    /* while(i<5){
         println(i)
         i++
     }*/
     do{
         println("this will work once")
         i++
     }while ( i < 0)
 }
 
*/

/*
internal val internalvalue= 50

open class Myclass(){
    public var a = 1
    private var b = 2
    protected var c = 3
    fun print(){
        println(a)
        println(b)
        println(c)
    }
     
}

class subclass : Myclass(){
    fun show(){
        println(a)
        //println(b) //error
        println(c)
    }
}

fun main(){
    val obj = Myclass()
    obj.print()
    val obj1 = subclass()
    obj1.show()
    
    println(internalvalue)
}
 */

/*
fun main(){
    val arr = arrayOf(1,2,3,4,5)
    arr[4] = 6
    println(arr[3])
    
    for(i in arr)
    println(i)
    
    val list = listOf("apple","banana","mango")
    println(list)
    println(list[1])
    
    val map = mapOf(1 to "ind", 2 to "sa", 3 to "aus")
    println(map)
    println(map[1])
    
    val set1 = setOf(1,2,3,4)
    println(set1)
    
}
*/

/*
fun main(){
    
    var a: String = "name"
    // a = null //error
    println(a)
    
    var b: String? = "day" // ? is used for making the string as nullable
    println(b)
    b = null
    println(b)
}
 */

/*
fun main(){
    
    val addlambda2:(Int , Int ) -> Int = {a , b -> a + b}
    println(addlambda2(5,10))
    
    val funname = addlambda2(50,49)
    println(funname)
    
    val addlambda3: (Int,Int,Int)-> Int = {a,b,c ->a+b+c}
    println(addlambda3(45,14,22))

    //const val funname2 = addlambda3(12,45,74)  //this will cause error
    //println(funname2)
    
}
 */
/*
fun main() {

    val addLambdaWithDefaults: (String?, Int?) -> Pair<String, Int> = { name, age ->

        val defaultName = name ?: "Unknown"
        val defaultAge = age ?: 30
        Pair(defaultName, defaultAge)
    }

    println(addLambdaWithDefaults("Alice", 25))  

    println(addLambdaWithDefaults(null, null)) 
    println(addLambdaWithDefaults("John", null)) 
    println(addLambdaWithDefaults(null, 40)) 
}
*/
/*
fun main(){
    fun nameAge (name:String = "unknown",age: Int = 0){
        println("$name , $age")
    }
    nameAge("mayank",45)
    nameAge("ram")
    nameAge(age = 12)
    
}
*/
/*
fun main() {

    var sum = 0
    var i = 1
    
    while(i <= Int.MAX_VALUE) {
        sum += i
        i++
        
        if(i == 11) {
            break
        }
    }
    
    print("The sum of integers from 1 to 10: $sum")
}
*/
/*
fun main(){
    for(i in 1.rangeTo(5)){
        println(i)
    }
    for(i in 1..5){
        println(i)
    }
    
    for(i in 10 downTo 5){
        println(i)
    }
    for(i in 10 until(15)){
        println(i)
    }
    for(i in 2..10 step(2)){
        println(i)
    }
    for(i in (1..10).reversed() ){
        println(i)
    }
    val arr: Array<String> = arrayOf("apple","banana","mango","apple","apple","mango","banana")
    println(arr.distinct())
    
    val a = 1..10
    val filter1 = a.filter{T -> T % 2 == 0 }
    println(filter1)
    
    val str: List<String> = listOf("apple","banana","mango","aple","apdple","mandgo","nana","aple","banadna","mandgo","apple","ale","ngo","banana")
    val fil = str.filter{it.length > 5}
    println(fil)
}
*/
/*
fun main(){
    fun add(x:Int ,y:Int):Int{
        val sum = x+y
        return sum
    }
    val res = add(5,6)
    println(res)
    
    fun sub(a:Int,b:Int,c:Int):Int{
        val substract = a-b-c
        return substract 
    }
    
    val a: Int = 65
    val b: Int =27
    val c: Int =9
    val result = sub(a,b,c)
    println(result)
    
    fun nameAdd(name:String,add:String):String{
        val deatails = name + add
        return deatails
    }
    println(nameAdd("mayank","indore"))
    
}
*/
/*
fun main(){
    val lambda:(Int,Int) -> Int = {a,b->a+b}
    println(lambda(5,7))

    val subLambda:(Int,Int)->Int = {a,b->a-b}
    println(subLambda(6,3))
    
    val details:(String,Int)->Pair<String,Int> = {name,age -> Pair(name,age)}
    println(details("mayank",25))
    
	fun hof(lambda: (Int, Int) -> Int) {
    println(lambda(5, 4))  
	}

	hof(lambda)  
}
*/
/*
class math{
    infix fun square(a: Int){
        val sqr = a*a
        println(sqr)
    }
}
fun main(){
    val obj = math()
    println(obj square 3)
}
*/


/*
class Add(var a:Int ,var b:Int){
    val c = a+b
    
    //constructor(a:Int, b:Int) {
    //    val c = a+b
    //    println(c)
    //}
    init {
        println(c)  
    }
}
 fun main(){
     
     Add(5,5)     
}
*/

/*
class Add{
    constructor(a:Int,b:Int){
        val c = a+b
        println(c)
    }
}
 
fun main(){
    val obj = Add(2,3)
}
 */

/*
open class Animal(){
    open fun walk(){
        println("animal is walking")
    }
    fun walk(leg: Int){
        println("animal is walking on $leg legs")
    }
}
class subclass: Animal(){
    override fun walk(){
        println("baby animal is walking")
    }
}
fun main(){
    val obj = Animal()
    obj.walk()
    obj.walk(4)
    val obj1 = subclass()
    obj1.walk()
} 
*/
/*
fun main(){
    
    val numbers = listOf(1, 2, 3)
    val squaredNumbers = numbers.map { it * it }
    println(squaredNumbers)
    println(numbers)
    numbers+2
    println(numbers)
    println(squaredNumbers)
    
    val names = listOf("Alice", "Bob", "Charlie")
    val greet = names.forEach { ("Hello, $it") }
    println(greet)
    println(names)

}
*/
/*
class Person {

    var name: String = ""
        get() = field.uppercase()      // custom getter
        set(value) {
            field = value       // custom setter
        }
}

fun main() {
    val p = Person()
    p.name = "mayank"   
    println(p.name)     
   
}

*/
/*
const val b: String = "apple"
//const val c: List<Int> = listOf(9,8,7)

fun main(){
    val a: List<Int> =listOf(1,2,3)
    //const val a = 1
    println(a)
    println(b)
    println(c)
}
*/
/*
object DatabaseConnection {
    init {
        println("Database Connection Initialized")
    }

    fun connect() {
        println("Connecting to the database...")
    }
}

class A {
    init {
        println("mayank")
    }
    
    fun name() {
        println("ogv")
    }
}

fun main() {

    DatabaseConnection.connect()

    val firstConnection = DatabaseConnection.connect()
    val secondConnection = DatabaseConnection.connect()
    println(firstConnection.hashCode())
    println(secondConnection.hashCode())

    println(firstConnection === secondConnection) 

    val objA = A() 
    objA.name() 
    
    println("objA hashCode: ${objA.hashCode()}")
    
    val anotherObjA = A()
    println("anotherObjA hashCode: ${anotherObjA.hashCode()}")  
}
*/

/*
data class User(val name: String, val age: Int)

typealias UserMap = Map<String, User>

fun process(obj: Any) {
    if (obj is String) {
        println("String length: ${obj.length}")
        
    }
}

fun main() {

    val userMap: UserMap = mapOf("user1" to User("Alice", 25),"user2" to User("Bob", 30))
	println(userMap)
    process("Hello, Kotlin!")
}
*/

// val expensiveResource: String by lazy {
//     println("Initializing expensive resource...")
//     "Data from an expensive operation"
// }

// fun main() {
//     println("App started.")

//     println("Accessing: $expensiveResource")

//     println("Accessing again: $expensiveResource")
// }

/*
class MyClass {
    lateinit var myProperty: String
    
    fun initializeProperty() {
        myProperty = "Hello, Kotlin!"
    }

    fun useProperty() {
        println(myProperty)
    }
}

fun main() {
    val myClass = MyClass()
    myClass.initializeProperty()
    myClass.useProperty()  
}
*/


// class MyClass {
//     companion object {
//         val TAG = "MyClassTag" 
//         init {
//             println("Initializing Companion Object")
//         }
//     }
//     init {
//         val nametag = "tag"
//             println("Initializing init block")
//         }
// //     val name = "a"

//     fun doSomething() {
//         println("Doing something with tag: $TAG")
//         //val name = "a"
//     }
// }

// fun main() {
//     MyClass
// //     println(MyClass.nametag)
// //     println(MyClass())
// //     println(MyClass.name)
// //     val obj = MyClass()
// //     obj.doSomething()
// }

/*
fun main() {
    val a: String? = "Hello" 
    val b: String? = null    
    val c: String? = "c"   

    val aLength = a?.length ?: 0
    
    val bLength = b?.length ?: "mayank"
    val aExcl = a!!.length 
    val cExcl = c!!.length  

    println(aLength)
    println(bLength) 
    println(c)         

    println(aExcl)  

    println(cExcl)  
}
*/
/*
fun main(){
    
fun divide(a: Int, b: Int): Double? {
    return try {
        a.toDouble() / b.toDouble()
    } catch (e: ArithmeticException) {
        println("Error: Division by zero!")
        null
    } finally {
        println("Division attempt finished.")
    }
 }
println(divide(5,0))

}
*/

/*
fun main() {

    val numbers = listOf(1, 2, 3, 4)

    val sumWithInitial = numbers.fold(10) { acc, next -> acc + next }
    println("Fold result: $sumWithInitial") 

    val sum = numbers.reduce { acc, next -> acc + next }
    println("Reduce result: $sum") 

    println("Any > 3: ${numbers.any { it > 4 }}")

    println("All > 0: ${numbers.all { it > 2 }}")
}
*/

// class Outer(val outerName: String) {
//     val name ="hey"
//     class Nested {
//         fun greet() = println("Hello from Nested Class")
//     }

//     inner class Inner {
//         fun greet() = println("Hello from Inner Class, my outer is $outerName")
//         init{
//         println(name)}
//     }
// }

// fun main() {
//     Outer.Nested().greet()
//     Outer("Main").Inner().greet()
// }

/*
data class book(val name:String,val price:Int,val author:String)

fun main(){
    val b = book("home",555,"nelson")
    println(b)
}
*/
/*
fun main() {
    data class Person(val name: String, val age: Int)

    val person = Person("Alice", 30)
    println(person.toString())  
    println(person)
}
*/
/*
class Person {
    var name: String = ""
    var age: Int = 0
}
fun main() {
    val person = Person().apply { name = "Alice" 
        age = 30 }
    
    person.name?.let { println("Name length: ${it.length}")}
    
    val description = person.run {"Person: $name, Age: $age"}
    
    val message = with(person) {"Name: $name, Age: $age"}
    person.also {println("Logging: Person is $it")}

    println(description)
    println(message)
}
*/

// sealed class MyExample {
//    class Class1 : MyExample() {
//        init{
//            println("sealed class one object is created")
//        }
//    }
//    class Class2 : MyExample(){
//        init{
//            println("sealed class two ojbect is created")
//        }
//    }
// }
// fun main() {
//    val obj: MyExample = MyExample.Class1() 
//    val obj1: MyExample = MyExample.Class2()
   
//   print( when (obj) { 
//       is MyExample.Class1 -> "option One has been chosen"
//       is MyExample.Class2 -> "option Two has been chosen"
//    })
// }

/*
sealed class ME{
    class hello(val a: Int, val b: Int):ME()
    class bye:ME()
}
fun main(){
    //val obj: ME = ME.hello(2,3)
    val obj: ME = ME.bye()
    val greet = when(obj){
       is ME.hello -> { 
            val sum: (Int, Int) -> Int = { a, b -> a + b }
            sum(obj.a, obj.b) 
        }
       is ME.bye->"bye"    
    }
    println(greet)
}
*/
/*
enum class Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

fun isWeekend(day: Day): Boolean {
    return when (day) {
        Day.SATURDAY, Day.SUNDAY -> true
        else -> false
    }
}

fun main() {
    val today = Day.MONDAY
    println("Is today a weekend? ${isWeekend(today)}")  

    val weekendDay = Day.SATURDAY
    println("Is Saturday a weekend? ${isWeekend(weekendDay)}")
}
*/
/*
fun main(){
    val a: Int? = null
    println(a)
    val b: Int? = null ?: 0
    println(b)
    val c: String? = null
    val cExcl = c?.length
    //val cExcl = c!!.length
    println(cExcl)
}
*/
/*
typealias UserMap = Map<String, Int>

fun process(obj: Any) {
    
    if (obj is String) {
        println("String length: ${obj.length}") 
    }
}

fun main() {

    val userMap: UserMap = mapOf("user1" to 25,"user2" to 30)
	println(userMap)
    process("44466")
}
*/
/*
class Myclass{
    
    fun hello(){
        println("hello")
    }
    
}
    fun Myclass.greet(){
    println("greet")
}

fun main(){
    fun Myclass.bye(){
    println("bye")
}
    val a = Myclass()
    a.hello()
    a.greet()
    a.bye()
}
*/
/*
val num: List<Int> = listOf(1,2,3)
fun main(){
    println(num)
}*/

//fun main(){
    
//     val lambda:(Int,Int)-> Int = {a,b->a+b}
//     println(lambda(1,2))
    
//     val name = 1
//     val check = when(name){
//         1->"name 1"
//         2->"name 2"
//         else -> "nothing"
//     }
//     println(check)
    
// 	val add3: (Int, Int, Int) -> Int = { a, b, c -> a + b + c }
// 	println(add3(2, 2, 2))

// 	fun hof(f: (Int, Int, Int) -> Int) {
//     	val result = f(5, 2, 3)
//     	println("Result from HOF: $result")
// 	}
// 	hof(add3)
    
    
//     val add4:(Int,Int,Int,Int)->Int = {a,b,c,d->a+b+c+d}
    
//     fun highOrder(add: (Int,Int,Int,Int)->Int){
//     	val r = add(3,3,3,3)
//         print(r)
//     }
    
//     highOrder(add4)    
    
//     val subs:(Int,Int)->Int = {x,y->x-y}
//     fun orderHigh(a:(Int,Int)->Int):(Int,Int)->Int{
//         val res = a(5,2)
//         println(res)
//         return subs
//     }
    
//     val f = orderHigh(subs)
// 	println(f(10, 3))
    

//}

//     data class Person(val name: String,val age: Int)
//     fun main(){
// 	val obj = Person("Mayank",45)
//     println(obj)

//     }

// interface NewInterface{
//     fun run(){
//         println("this is run")
//     }
//    fun stop()     
    
// }

// class MyClass: NewInterface{
//     fun classrun(){
//         println("this is classrun")
//     }
//     fun stop(){
//         println("this is from class")
//     }
// }

// fun main(){
//     val obj = MyClass()
//     obj.run()
//     obj.stop()
// }

// fun main(){
//     val lambda:(Int,Int)->Int = {x,y->x+y}
//     println(lambda(2,3))
    
//     fun hof(a:(Int,Int)->Int){
//         val res = a(4,5)
//         println(res)
//     }
//     hof(lambda)
// }

// interface A {
//     fun greet() { println("Hello from A") }
// }
// interface B {
//     fun greet() { println("Hello from B") }
// }
// class C : A, B {
//     override fun greet() {
//         super<A>.greet()
//         super<B>.greet()
//     }
// }
// fun C.mayank(name:String){
//     println("this is $name fun from class C")
// }
// fun A.mayank2(name:String){
//     println("this is $name fun from interface A")
// }
// fun main(){
//     val obj = C()
//     obj.greet()
//     obj.mayank("runija")
//     obj.mayank2("interface")
// }


// enum class Direction {
//     NORTH, SOUTH, EAST, WEST
// }
// fun main() {
//     val myDirection = Direction.EAST
//     println(myDirection)
// }

// fun main(){
//     val names = listOf("one","two","three","four","five")
//     println(names)
//     for(i in names){
//         println(i)
//     }

// }

// inline fun person(name: String, age:Int){
//     println("The person name is $name, and age is $age")
// }

// inline fun add(a:(Int,Int) -> Int){
//     val res = a(3,3)
//     println(res)
// }

// fun main(){
    
// 	add{a,b->a+b}
    
//     //person("Mango",34)
// }



// inline fun doSomething(action: () -> Unit) {
//     println("Before action")
//     action()  
//     println("After action")
// }

// fun main() {
//     doSomething {
//         println("Performing action")
//     }
// }

// inline fun multiplyByTwo(x: Int): (Int) -> Int {
//     return { y -> x * y }
// }

// fun main() {
//     val multiply = multiplyByTwo(5)
//     println(multiply(10))  
// }


// fun main(){
//     var i =1
//     while(i<5){
//         println(i)
//         i++
//     }
    
//     do{
//         println("this is do loop")
//         i++
//     }while(i==0)
// }


//fun main(){
//     val names: List<String> = listOf("one","two","three")
//     println(names)
//     val arr: Array<Int> = arrayOf(1,2,3,4,5)
// 	arr.forEach {print(it)}
//     val map: Map<Int, String> = mapOf(1 to "one",2 to "two",3 to "three")
//     println(map)
//     val set1: Set<String> = setOf("apple","mango","banana")
//     println(set1)
    
// }


// fun main(){
//     val a =10
//     val b = 20
// //     if (a>20){
// //         println(a)
// //     }
// //     else {
// //         println(b)
// //     }
//    val result = if (a > 0) {
//         "Positive"
//     } else {
//         "Not Positive"
//     }

//     println(result)
// }


// fun main(){
//     val num = 5 
//     val res = when(num){
//         1 -> "this is 1"
//         5 -> "this is 5"
//         else -> "nothing"
//     }
//     println(res)
// }

// fun main(){
//     for (i in 1.rangeTo(10)){
//         println(i)
//     }
//     for (i in 22 downTo 5){
//         println(i)
//     }
//     for (i in 2..20 step 2){
//         println(i)
//     }
// }

// fun main(){
// //     for (i in 10..50){
// //         println(i)
// //     }
     
//     var i = 0 
// //     while(i<5){
// //         println(i)
// //         i++
// //     }
//     do {
//         i++
//         println(i)
//     }while(i==0)
// }

// fun main (){
//    fun add(){
//        println("do nothing")
//    }
//    fun add(a: Int,b: Int){
//        println(a+b)
//    }
//    add()
//    add(2,3)
// }

// fun main(){
//     val lambda:(Int,Int)->Int = {a,b ->a+b}
//     println(lambda(2,2))
    
//     fun hof(a: (Int,Int)->Int){
//         val res = a(5,5)
//         println(res)
//     }
//     hof(lambda)
// }

// class MyClass{
//     fun add(){
//         println("do adding")
//     }
// }
// fun MyClass.sub(){
//     println("do subtraction")
// }
// fun main(){
//     val obj = MyClass()
//     obj.add()
//     obj.sub()
// }

// inline fun add(){
//     println("this is inline funciton")
// }
// fun main(){
//     add()
// }

// class Myclass{
// //     fun dosomething():String?{
// //         val name: String= "abc"
// //         return name
// //     }
// }
// fun main(){
//     val obj: Myclass? = Myclass()
//     println(obj!!)
// //     println(obj)
// //     obj = null
// //     val abc: String?= null
// //     println(abc?.length)
    
// }

// data class book(val author: String,val price:Int)
// fun main(){
//     val obj = book("kin",34)
//     println(obj)
// }


// class Myclass(){
//     fun start(){
//         println("hello")
//     }
// }
// fun main (){
//     val obj = Myclass()
//     val obj1 = Myclass()
//     println(obj==obj1)
//     println(obj.hashCode())
//     println(obj1.hashCode())

    
// }

// fun main(){
//     val name: Nothing = null
//     println(name)
// }

// object Name{
//     init{
//         println("init object")
//     }
//     fun run(){
//         println("mayank")
//     }
// }
// class Myclass{
//     init{
//         println("init myClass")
//     }
// //     fun stop(){        
// //     }
//     companion object{
//         val name = "name"
//         fun run(){
//             println("companion running")
//         }
//     }
// }
// fun main(){ 
//     println(Myclass.name)
//     println(Myclass.name)
//     Myclass.run()
// //     Myclass.stop()
//     Name.run()
//     Name.run()
// }

// open class A{
//     open fun run(){
//         println("run method class A")
//     }
// }
// class B:A(){
//     override fun run(){
//         println("run method class B")
//     }
// }
// fun main(){
//     val obj = A()
//     obj.run()
// }

// val lambda: () -> Unit = {println("this is lambda")}

// fun hof(a: Int, run:()-> Unit) {
//     println("hof")
//     run()
// }

// fun main(){
//     hof(5,lambda)

// }

// fun main(){
//     var name: Int? = null
    
//     name?.let{println("value is null")}
    
//     println(name)
    
//     name = 57
//     val a: Int = 8
//     var b: Int? = 9
//     b = null
//     println(a+ (b?:0))
	
//     println(name)
// }

//issue

// fun main() {
//     var name: String? = "mayank"
// //     println(name)
//     name = null
//     println(name!!)
// }

// fun main(){
//     val lambda = {println("this is lambda")}
    
//     fun hof(lmda : () -> Unit){
//         lmda()
//     }
    
//     hof(lambda)
// }

// fun main(){
//     val numbers: List<Int> = listOf(1,2,3,4,5,6)
// //     val map = numbers.map{it+it}
// //     println(map)
    
// //     val filter = numbers.filter{it==3}
// //     println(filter)
    
// //     numbers.forEach{println(it==2)}
// //     println(numbers)
 
//     val fold: Int = numbers.fold(5){a,b->a+b}
//     println(fold)
    
//     println(numbers.reduce{a,b->a+b})
// //     println(numbers)
// }

// class Myclass(val name:String,val age: Int){
//     init{
//         println("$name $age")
//     }
//     constructor(age:Int): this("",0){
//         println(age)
//     }
// }
// fun main(){
//     Myclass("name",87)
//     Myclass(5)
// }

// data class Name(val name: String,val age: Int)
// // class Name(val name: String,val age:Int)
// fun main(){
//     val obj = Name("bob",56)
// //     val (name,age) = obj
// //     println(name)
// //     println(age)
//     println(obj.name)
//     println(obj.age)
//     println(obj)
//     println(obj.toString())
//     val obj2 = obj.copy()
//     println(obj2)
// 	println(obj2.hashCode())
//     println(obj.hashCode())
// //     val objcopy = obj.copy()
// //     println(objcopy)
// //     println("equals() ${obj.equals(objcopy)}")
// //     println("== ${obj==objcopy}")
// //     println("=== ${obj===objcopy}")
// }

// interface MyInterface{
//     fun sleep(name: String){
//         println("this is interface $name")
//     }
//     fun eat()
// }
// class Bird(): MyInterface{
//     fun sleep(){
//         println("this is overloded sleep")
//     }
//     override fun sleep(name:String){
//         super <MyInterface>.sleep(name)
//         println("bird is sleeping")
//     }
//     override fun eat(){
//         println("Bird is eating")
//     }
// }
// fun main(){
//     val obj = Bird()
//     obj.sleep("owl")
//     obj.sleep()
//     obj.eat()
// }


// abstract class Animal(){
//     abstract fun eat()
//     abstract fun sleep()
    
//     fun fly(){
//         println("animal is flying")
//     }
// }
// class Dog():Animal(){
//     override fun eat(){
//         println("dog eating")
//     }
//     override fun sleep(){
//         println("dog sleeping")
//     }
// }
// fun main(){
//     val obj = Dog()
//     obj.eat()
//     obj.sleep()
    
// }

// fun main(){
//     val name by lazy{
//         println("this is lazy")
//         "mayank"
//     }     
//     println(name)
//     println(name)
    
//     var age by lazy{
//         println("this is lazy by var")
//     }
//     println(age)

// }

// lateinit var name:String  
// val age:String by lazy {"67"}
// val age1:String ="45"

// fun main(){
    
//     name = "hello"
//     println(age)
//     println(name)
// }

// fun main(){
//     val num = listOf(1,2,3,4,5,6)
//     num.forEach{println(it+4)}
//     println(num.fold(4){a,e->a+e})
//     println(num.reduce{a,e->a-e})
//     println(num.map{it*it})
//     println(num.filter{it==1})
// }

// fun main(){
//     val name: String? = null
//     try{
//         println(name!!.length)
//     }
//     catch(e: Exception){
//         println(e)
//     }
//     finally{
//         println("this is finally block")
//     }
//     println("this is running after exception ")
// }

// lateinit var name: String
// fun main(){
    
//     name = "hello"
//     println(name)
    
// }
// fun main(){
//     val name = listOf("apple",3,"banana",56,true,2.3F)
// //     for(i in name){
// //     if (i is Int){
// //         println("$i is Integer")
// //     }
// //     else if(i is String){
// //         println("$i is String")
// //     }
// //     else if(i is Boolean){
// //         println("$i is Boolean")
// //     }
// //     else{
// //         println("type is undefiend")
// //     }
    
// //   }
// 	for(i in name){
//       val typecheck = when(i){
//           is String -> "$i is String"
//           is Int -> "$i is Integer"
//           is Boolean -> "$i is Boolean"
//           is Float -> "$i is Float"
//           else -> "$i is undefiend"
//       }
//       println(typecheck)
//     }
//     println(name::class.simpleName)
    
// }

// fun main(){
//     fun typecast(name: Any){
//         if(name is String){
//             println("this is String $name")
//         }
//         else if(name is Int){
//             println("this is interger plus five ${name+5}")
//         }
//         else {
//             println("we dont know the type $name")
//         }
//     }
//     typecast(5)
//     typecast("hello")
//     typecast(true)
//     typecast(2.3F)
// }
// fun main(){
//     val age =17
//     val checkage = if(age>18)
//      	"can vote"
//     else
//         "cant vote"
//         
//     println(checkage)
// }

// fun main(){
// //     val lambda: (Int,Int)->Int ={a,b->a+b}
// //     println(lambda(5,5))
   
// //     fun hof(a: (Int,Int)->Int): Int{
// //         println(a(5,5))
// //         val num = 3
// //         return num
// //     }
    
// //     println(hof(lambda))
//     val add3 = {a: Int, b: Int -> a+b}
//     val add2: (Int,Int)->Int = {a,b->a+b}
//     println(add3(1,2))
//     println(add2(5,2))

// }


// fun main(){
//     val lm:(Int,Int)->Int = {a,b->a}
//     lm(1,2)
//     fun hof(a: (Int,Int)-> Int ){
//         a(2,3)
//         println(a)
//     }
//     hof(lm)
// }

// open class animal(){
//     fun run(){
//         println("hello")
//     }
// }
// class dog(): animal(){
    
// }
// fun main(){
//     val obj = dog()
//     obj.run()
// }

// object name {
//     init{
//         println("name")
//     }
    
// }
// class Myclass(){
//     init{
//         println("vlass")
//     }
// }
// fun main() {
//     name
// }

// fun main(){
// //     val list = mutableListOf(1,2,3)
// //     println(list)
// //     list[0]=7
// //     list.add(4)
// //     list.remove(3)
// //     list.removeAt(0)
// //     println(list)
    
//     val map = mutableMapOf(1 to "one",2 to "two",3 to "three")
//     println(map)
//     println(map.get(2))
//     map[1]
    
    
// }


// fun main(){
//     lateinit var name: String
//     println(name)
//     name ="hello"
//     println(name)
//     val name2: String by lazy{
//         "hello"
//     }
//     println(name2)
// }

// fun main(){
//     val lambda: (Int,Int)->Int = {a,b->a+b}
//     fun hof(a:(Int,Int)->Int){
//         val res = a(2,3)
//         println(res)
//     }
//     hof(lambda)
// }


// fun name(){
//     	println("name")
//         println(name)
//     }
// fun main(){
    
//     name()
// }

// fun main(){
//     val lazyValue: String by lazy {
//     println("Computing the value...")
//     "Hello"
//  }
//     println(lazyValue)
//     println(lazyValue)
// }
 
// import kotlin.properties.Delegates

// class MyClass {
//     var x: Int by Delegates.observable(0) { _, old, new ->
//         println("Changed from $old to $new")
//     }
// }
// fun main(){
// 	val obj = MyClass()
//     println(obj.x)
// 	obj.x = 48

// }

//     lateinit var book1: String
//     var book2: String

// fun main(){
//     val map: Map<Int,String>
//     val age: Int
//     lateinit var book1: String
//     book1 = "pokemon"
//     println(book1)
//     var book2: String
//     book2 = "harryporter"
//     println(book2)
//     val name: String by lazy{
//         "name"
//     }
//     println(name)
// }
// val age: Int

// fun main(){
//     val name: String
// // 	println(name)
// }
// fun main(){
//     fun name(n: String = "hello"){
//         println(n)
//     }
//     name()
//     name("world")
// }

// fun main(){
//     fun add(){
//         println("nothing")
//     }
//     fun add(a:Int,b:Int):Int{
//         return a+b
//     }
//     add()
//     println(add(2,3))
// }

// open class Animal(){
//     fun eat(){
//         println("eating")
//     }
//     open fun sleep(){
//         println("sleeping")
//     }
// }
// class Dog(): Animal(){
//     override fun sleep(){
//         super <Animal>.sleep()
//         println("Dog is sleeping")
//     }
    
// }
// fun main(){
//     val obj = Dog()
//     obj.eat()
//     obj.sleep()
    
// }

// object MyObjectClass{
//     init{
//         println("this is object class")
//     }
// }
// class Myclass(){
//     companion object name{
//     init{
//         println("this is companion object")
//     }
//     val a = 45
//     }
// }

    
// fun main(){
    
//     MyObjectClass
//     println(Myclass.a)
    
// }

// fun main(){
//     for(i in 3.until(5)){
//         println(i)
//     }
//     for (i in 5.rangeTo(6)){
//         println(i)
//     }
//     for (i in 8.rangeTo(23)){
//         println(i)
//     }
//     for(i in 5 downTo 1){
//         println(i)
//     }
//     for(i in 4.rangeTo(8) step 2){
//         println(i)
//     }

// }

// fun main(){
//     var i = 0
// //     while(i <8){
// //         print("$i ")
// //         i++
        
// // //         print("$i ")
// //     }
//     do{
//         println(i)
//         i++
//     }while(i<0)
// }

// fun myColumn(content: () -> Unit) {
//     println("Start Column")
//     content()  
//     println("End Column")
// }
// fun main(){
//     myColumn(){
//         println("hello")
//         println("hello")
//         println("hello")
//         println("hello")
//         println("hello")
//     }
// }

// class Myclass(){
    
// }
// inline fun add(){
//     println("add")
// }

// fun main(){
//     val lambda:(Int,Int)->Int = {a,b->a+b}
//     fun hof(a:(Int,Int)->Int){
//         println(a(2,3))
//     }
//     hof(lambda)
//     add()
// }

// fun main(){
//     try{
//         val name:String? = null
//         val len = name!!.length ?: "null value is here"
//         println(len)
//     }
//     catch(e: Exception){
//         println(e)
//     }
// }
 
 
// lateinit var name:String
// val name2: String by lazy{"hello"}
// fun main(){
//     name = ""
//     println(name)
//     println(name2)
//     val nums = listOf(2,2,3,2,5,2)
//     val map = nums.map{it*it}
//     println(nums.fold(4){a,e->a*e})
//     println(map)
// }
// 
// data class WellnessTask(val id: Int, val label: String)

// fun getWellnessTasks() = List(4) { it -> it to "Task number $it" }
// fun main(){
//     println(getWellnessTasks())
// }
