// immutable 변수 정의
val timeSeconds = 15

// mutable 변수 정의
var timeMinutes = 5

// call expression - 호출 식
val a = readLine().toInt()

// not-null assertion - 단언 연산자
val b = readLine()!!.toInt()

// 타입 명시
val c: Int = readLine()!!.toInt()

// 하드 키워드
val var fun

// 소프트 키워드
import

// 작은역 따옴표
val 'fun' = 1
val 'name with spaces' = 2

// augmented assignment and binary
var result = 3
result *= 10 // result * 10
result -= 10 // result - 10

// prefix and postfix
var a = 1
println(a++) // a는 2, 1 출력
println(++a) // a는 3, 3 출력
println(--a) // a는 2, 2 출력
pringln(a--) // a는 1, 2 출력