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