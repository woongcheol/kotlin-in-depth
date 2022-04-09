// 람다 기본 정의
val lamdaExample: Type = { argumentList -> codeBody }

// 타입 추론
val square = { number: Int -> number * number } // O
val square = { number -> number * number } // X
val square: (Int) -> Int = { number -> number * number } // O
val nameAndAge = { (name: String, age: Int) -> "name:$name, age:$age" } // O

// 클래스 확장
val stringPlus : String.() -> String = {
    this + "Hello World!"
}

val test = "test : "
println(test.stringPlus())

fun extendString(arg: String, num: Int) : String {
    val another : String.(Int) -> String = {
        this + it
    }
    return  arg.another(num)
}

// 값에 의한 호출
fun main(){
    val result = callByValue(lamda())
    println(result)
}

fun callByValue(b : Boolean) = b

val lamda : () -> Boolean = {true}

// 이름에 의한 호출
fun main() {
    val result = callByName(otherLambda)
    println(result)
}

fun callByName(b : () -> Boolean) = b()

val otherLambda = {true}

// 다른 함수의 참조에 의한 일반 함수 호출
fun main() {
    funcParam(3, 2, ::sum)
}

fun sum(a: Int, b : Int) = a + b

fun funcParam(a: Int, b : Int, c : (Int, Int) -> Int) = c(a, b)