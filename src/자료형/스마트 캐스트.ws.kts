// 스마트 캐스트 사용
var test: Number = 12.2
println(test) // 12.2
test = 12
println(test) // 12
test = 120L
println(test) // 120
test += 12.0f
println(test) // 132.0

// Any와 is
val x: Any
x = "Hello"
if (x is String) { // x는 자동적으로 String으로 캐스팅 된다.
    print(x.length)
}

// as
val x: String = y as String // null일 경우
val x: String? = y as? String // 예외 발생 피할 경우

// 묵시적 변환
var a: Any = 1 // Any형 a는 1로 초기화될 때 Int형이 됨
a = 20L // Int형에서 Long형으로 자동 변환되어짐