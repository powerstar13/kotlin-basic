fun main() {

//    try {
        Thread.sleep(1) // 코틀린은 기본적으로 체크트 익셉션을 강제하지 않기 때문에 컴파일러가 오류라고 생각하지 않는다.
//    } catch (e: Exception) { // 개발자가 필요로 할 때에는 try-catch를 처리할 수도 있다.
//        println("에러 발생!")
//    }

    try {
        throw Exception()
    } catch (e: Exception) {
        println("에러 발생!")
    } finally {
        println("finally 실행!")
    }

    // 자바에서는 try-catch가 구문으로 동작하기 때문에 값을 반환할 수 없지만, 코틀린에서는 try-catch가 표현식이기 때문에 값을 반환할 수 있다.
    val a = try {
        "1234".toInt()
    } catch (e: Exception) {
        println("예외 발생!")
    }
    println(a)

//    throw Exception("예외 발생!") // 코틀린에서 에러를 발생시키고 싶은 경우 throw를 통해 작성할 수 있다.

    val b: String? = null // nullable 타입
    val c: String = b ?: failFast("b is null") // 엘비스 연산자에 의해 Nothing인 경우 non-null 타입인 String으로 선언할 수 있다. (엘비스 연산자 + Nothing 조합은 컴파일러에서 절대로 null이 나올 수 없다고 추론하기 때문에 non-null 타입으로 선언할 수 있는 것이다.)

    println(c.length)

    failFast("예외 발생!!")

    println("이 메시지는 출력될까?") // Unreachable code: 앞에서 Nothing을 반환하는 메서드가 존재할 경우 컴파일러에서 해당 코드는 작동하지 않을 수 있다고 경고해주기 때문에 유용하다.
}

fun failFast(message: String) : Nothing { // throw를 반환하게 되면 함수에서는 Nothing이라는 값을 반환하게 된다. (안전하지 않은 값을 반환할 때에는 Nothing을 반환하도록 된다.)
    throw IllegalArgumentException(message)
     // 기본적으로 코틀린에서 throw 자체도 표현식이기 때문에 값이 될 수 있다.
}