// generic
val a = emptyArray<String>()

// 타입 추론
val b = arrayOf("hello", "world")
val c = arrayOf(1, 2, 3)

// 입력 데이터
val size = readLine()!!.toInt()
val squares = Array(size) {
    (it + 1) * (it + 1)
}

// 원본과 별도의 배열 저장
val numbers = squares.copyOf()

// 배열 비교 - 참조 비교, 내용 비교
if (numbers == squares) {
    println("true")
} else {
    println("false")
}

if (numbers.contentEquals(squares)) {
    println("true")
} else {
    println("false")
}