class ResourceLoader {
    // The value will only be calculated when 'heavyResource' is accessed for the first time
    val heavyResource: String by lazy {
        println("--- Initializing heavy resource ---")

        // Simulate a time-consuming operation
        Thread.sleep(1000)
        "Resource Data Loaded"
    }
}

fun main() {
    val loader = ResourceLoader()
    println("ResourceLoader object created, but lazy property not initialized yet.")

    // First access: Initialization happens here
    println("First access: ${loader.heavyResource}")

    // Second access: The stored value is returned immediately (no re-initialization)
    println("Second access: ${loader.heavyResource}")
}