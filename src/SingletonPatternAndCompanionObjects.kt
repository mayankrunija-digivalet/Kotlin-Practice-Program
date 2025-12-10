// Singleton declaration
object AppConfig {
    val version = "1.0.0"
    fun setup() = println("App configured with version $version.")
}
class Logger {
    //Companion object (like static members)
    companion object {
        private const val TAG = "AppLogger"
        fun log(message: String) {
            println("[$TAG] $message")
        }
    }
    fun logInstance(message: String) {
        println("[Instance] $message")
    }
}
fun main() {
    // Singleton access (no instance creation needed)
    AppConfig.setup()

    //Companion object access (using class name)
    Logger.log("Application started.")

    //Normal class instance access
    val loggerInstance = Logger()
    loggerInstance.logInstance("Instance log message.")
}