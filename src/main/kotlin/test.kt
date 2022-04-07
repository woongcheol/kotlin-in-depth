fun main() {
    fun hexDigit(n: Int): Char {
        if (n in 0..9) return '0' + n
        else if (n in 10..15) return 'A' + n - 10
        else return '?'
    }

    println(hexDigit(1))
    println(hexDigit(1).javaClass)
    println(hexDigit(11))
    println(hexDigit(11).javaClass)

    fun hexDigitTwo(n: Int): Char {
        when (n) {
            in 0..9 -> return '0' + n
            in 10..15 -> return 'A' + n - 10
            else -> return '?'
        }
    }

    println(hexDigitTwo(5))
    println(hexDigitTwo(5).javaClass)
    println(hexDigitTwo(15))
    println(hexDigitTwo(15).javaClass)

    val minNum = Int.MIN_VALUE
    val maxnNum = Int.MAX_VALUE
    println(minNum)
    println(maxnNum)
}