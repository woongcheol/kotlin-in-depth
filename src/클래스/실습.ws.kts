// 클래스 생성자 - 주요 생성자
class PersonKotlin constructor(name: String) {
    val name = name
}

// 클래스 생성자 - 주요 생성자 생략
class PersonKotlin(name: String) {
    val name = name
}

// 클래스 생성자 - 주요 생성자 및 init 블록
class PersonKotlin constructor(name: String) {
    val name = name

    // 유효성 검사 코드
    init {
        // name이 isNotEmpty를 만족하지 않으면 IllegalArgumentException 발생
        require(name.trim().isNotEmpty()) {
            "require name"
        }
    }
}

// 클래스 생성자 - 주요 생성자 프로퍼티 선언 및 초기화 간소화
class PersonKotlin(val name: String, var age: Int) {
}

// 클래스 생성자 - 보조 생성자
class PersonKotlin {
    val name: String

    constructor(name: String) {
        this.name = name
    }
}

// 클래스 생성자 - 주요 생성자 또는 보조 생성자 초기화
class PersonKotlin(age: Int) {
    val age = age // o, 주요 생성자로 인해 초기화 됨
}

class PersonKotlin() {
    val age: Int // x, 빈 주요 생성자로 인해 보조 생성자에서 초기화를 하지 못함

    constructor(age: Int) {
        this.age = age
    }
}

class PersonKotlin {
    val age: Int // o, 보조 생성자에서 초기화 가능

    constructor(age: Int) {
        this.age = age
    }
}

// 클래스 생성자 - 주요 생성자 및 보조 생성자 혼합 사용
class PersonKotlin(val name: String) {
    // 주요 생성자에 없는 프로퍼티는 임의로 초기화 필요
    var age: Int = 0

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }
}