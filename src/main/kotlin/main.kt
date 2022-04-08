class PersonKotlin(val name: String) {
    var age: Int = 0

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }
}

fun main() {
    val p = PersonKotlin("jin", 21)
    println("name: ${p.name}, age: ${p.age}")
}