// 기본적인 함수 선언 스타일 (fun 키워드 사용)
fun sum(a: Int, b: Int) : Int {
    return a + b
}

// 표현식 스타일
fun sum2(a: Int, b: Int) : Int = a + b // 몸통(블럭)이 없는 표현식

// 표현식 & 반환타입 생략
fun sum3(a: Int, b: Int) = a + b // 변수에 따라 추론할 수 있기 때문에 반환타입을 생략할 수 있다.

// WARN: 몸통(블럭`{}`)이 있는 함수는 반환 타입을 제거하면 컴파일 오류
//fun sum4(a: Int, b: Int) {
fun sum4(a: Int, b: Int) : Int {
    return a + b
}

// 반환타입이 없는 함수는 Unit이라는 특별한 타입을 반환한다. (java의 void와 유사하다고 보면 된다.)
//fun printSum(a: Int, b: Int) : Unit { // Unit을 반환한다 해서 특별한 기능이 있는 것은 아님
fun printSum(a: Int, b: Int) {
    println("$a + $b = ${a + b}")
}

// 디폴트 파라미터
fun greeting(message: String = "안녕하세요!!") {
    println(message)
}

/**
 * @see: Message.java
 */
//fun main() {
//    greeting() // 전달된 파라미터가 없는 경우 default 파라미터로 처리되는 것을 확인할 수 있다.
//    greeting("HI!!!")
//}

fun log(level: String = "INFO", message: String) {
    println("[$level]$message")
}

/**
 * @see: Logger.java
 */
fun main() {
    log(message = "인포 로그") // named arguments 기법: 변수명을 지목하여 값 할당
    log(level = "DEBUG", "디버그 로그")
    log("WARN", "워닝 로그") // 메서드에 순서대로 값을 전달
    log(level = "ERROR", message = "에러 로그") // 버그를 줄일 수 있는 굉장히 유용한 문법이라 생각됨
}