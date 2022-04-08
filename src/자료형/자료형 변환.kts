// 자료형 변환
val a: Int = 1
val b: Double = a.toDouble()
val c: Int = 1.1.toInt()

// 기본형과 참조형 자료형의 비교 원리
val a: Int = 123 // 기본형으로 변환 및 저장
val b: Int = 123 // 상동
println(a == b) // true
println(a === b) // true

val a: Int = 123 // 기본형으로 변환 및 저장
val b: Int? = 123 // 참조형으로 저장
println(a == b) // true
println(a === b) // false