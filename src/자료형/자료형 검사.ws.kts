// 자료형 검사 및 변환
// null 변수에 접근하려하면 NPE 발생(null 포인터 예외)

// 변수에 null 할당 - 오류 발생
val str : String = "Hello Kotlin"
str = null
println(str)

// 변수에 null 할당 - 물음표 기호 명시
val str : String? = "Hello Kotlin"

// 세이프 콜(?.)
// null이 할당되어 있을 가능성이 있는 변수를 검사하여 안전하게 호출
println("str:$str, str.length: ${str?.length}")

// non-null 단정 기호(!!.)
println("str:$str, str.length: ${str!!.length}")

// 조건문 활용
val len = if(str != null) str.length else -1
println("str:$str, str.length: ${len}")

// 세이프 콜과 엘비스 연산자 활용
println("str:$str, str.length: ${str?.length ?: -1}")