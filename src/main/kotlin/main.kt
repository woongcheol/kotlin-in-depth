fun main() {
    var str : String? = "Hello Kotlin"
    str = null
    println("str:$str, str.length: ${str?.length ?: -1}")
}

