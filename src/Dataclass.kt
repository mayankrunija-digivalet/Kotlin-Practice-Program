data class User(val id: Int, val name: String)

fun main() {
    val user1 = User(1, "Alice")
    val user2 = User(1, "Alice")
    val user3 = User(2, "Bob")

    // 1. toString()
    println("toString(): $user1") // Output: User(id=1, name=Alice)

    // 2. equals() (Structural equality)
    println("user1 == user2: ${user1 == user2}") // Output: true
    println("user1 == user3: ${user1 == user3}") // Output: false

    // 3. copy()
    val user1Copy = user1.copy(name = "Alison")
    println("Copy: $user1Copy") // User(id=1, name=Alison)

    // 4. Destructuring Declaration
    val (id, name) = user1
    println("Destructuring: ID=$id, Name=$name")
    println(user1)
}