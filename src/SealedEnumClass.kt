// Enum Class
enum class Color(val rgb: String) {
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF");

    fun hexCode() = rgb
}
// Sealed Class
sealed class NetworkResult {
    data class Success(val data: String) : NetworkResult()
    data class Error(val code: Int) : NetworkResult()
    object Loading : NetworkResult() // Singleton object
}
fun handleResult(result: NetworkResult) {
    when (result) {
        is NetworkResult.Success -> println("Success: ${result.data}")
        is NetworkResult.Error -> println("Error Code: ${result.code}")
        NetworkResult.Loading -> println("Loading data...")
    }
}

fun main() {
    // Enum Example
    println("Red hex code: ${Color.RED.hexCode()}")

    // Sealed Class Example
    val success = NetworkResult.Success("User data fetched")
    val error = NetworkResult.Error(404)

    handleResult(success)
    handleResult(error)
    handleResult(NetworkResult.Loading)
}