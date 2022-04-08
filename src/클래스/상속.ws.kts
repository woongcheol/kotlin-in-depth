// (암시적) 모든 클래스는 공통의 상위 클래스로 Any 클래스를 갖는다.
open class Base(p: Int) {
    var p = p
}

// (명시적) 상위 클래스를 지정하기 위해 클래스 헤더의 콜론에 적는다.
class Derived(p: Int) : Base(p) // 파생 클래스가 주요 생성자를 가질 경우

class Derived : Base {
    constructor(p: Int) : super(p)
} // 파생 클래스가 주요 생성자를 갖지 않을 경우

// 메소드 오버라이드
open class Base {
    open fun v(a:Int, b:Int) {
        println(a+b)
    }
}

class Derived : Base() {
    override fun v(a: Int, b: Int) {
        super.v(a, b)
    }
}

fun main() {
    val sum = Derived()
    sum.v(1, 2)
}