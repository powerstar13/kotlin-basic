open class Dog {// 코틀린의 class는 기본적으로 final이기 때문에 open 키워드를 통해 상속이 가능한 클래스로 바꿀 수 있다.

    open var age: Int = 0

    open fun bark() {
        println("멍멍")
    }
}

open class Bulldog(final override var age: Int = 0) : Dog() {

    final override fun bark() {
        super.bark() // super 키워드를 통해 상위 클래스에 접근할 수 있다.
    }
}

abstract class Developer {

    abstract var age: Int

    abstract fun code(language: String)
}

class BackendDeveloper(override var age: Int) : Developer() {

    override fun code(language: String) {
        println("I code with $language")
    }

}

fun main() {

    val dog = Bulldog(age = 2)
    println(dog.age)
    dog.bark()

    println("----------------------")

    val backendDeveloper = BackendDeveloper(age = 20)
    println(backendDeveloper.age)
    backendDeveloper.code("kotlin")
}