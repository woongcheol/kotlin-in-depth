import kotlin.math.PI

// 원 넓이 계산 함수
fun circleArea(radius: Double): Double {
    return PI * radius * radius
}

// 식이 본문인 함수
fun circleAreaTwo(radius: Double): Double = PI * radius * radius

// 식이 본문인 함수 - 반환 타입 생략
fun circleAreaTwo(radius: Double) = PI * radius * radius

// 위치 기반 인자
fun rectangleArea(width: Double, height: Double): Double {
    return width * height
}

// 이름 붙은 인자로 호출
rectangleArea(width = w, height = h)

// 디폴트 파라미터
fun readInt(radix: Int = 10) = readLine()!!.toInt(radix)

// vararg
fun printSorted(vararg items: Int) {
    items.sort()
    println(items.contentToString())
}

// 조건문
fun hexDigit(n: Int): Char {
    if (n in 0..9) return '0' + n
    else if (n in 10..15) return 'A' + n - 10
    else return '?'
}

fun hexDigitTwo(n: Int): Char {
    when {
        n in 0..9 -> return '0' + n
        n in 10..15 -> return 'A' + n - 10
        else -> return '?'
    }
}

fun hexDigitThree(n: Int) = when {
    n in 0..9 -> '0' + n
    n in 10..15 -> 'A' + n - 10
    else -> '?'
}

fun hexDigitFout(n: Int) = when(n) {
    in 0..9 -> '0' + n
    in 10..15 -> 'A' + n - 10
    else -> '?'
}