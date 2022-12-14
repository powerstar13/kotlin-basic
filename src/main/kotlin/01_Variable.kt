var x = 5 // 코틀린에서는 변수를 탑-레벨에 위치시킬 수 있다. (클래스나 함수에 속하지 않는다.)

fun main() {
    // 변수 선언
    val a : Int = 1 // 변수명 : 타입 = 값

    val b = 1 // 변수 = 값 (변수의 값에 따라 타입을 자동으로 추론해준다.)

    // 지연 할당
    val c : Int // 변수명을 먼저 선언하고
    c = 3 // 값을 할당하는 것을 지연 할당이라 한다.

//    val d // WARN: 타입을 명시하지 않으면 컴파일 오류가 발생한다.
//    d = 123

    // 변수 선언 시 사용하는 val, var 키워드
    // val: value의 약자 (불변 변수: 값을 한 번 할당하고 나면 재할당이 불가능하다. readOnly와 같다.)
    // var: variable의 약자 (가변 변수: 값을 재할당할 수 있다.)

//    val e : String = "Hello"
    var e : String = "Hello"
    e = "World" // val 키워드를 사용할 경우 값을 재할당 할 수 없으므로 컴파일 오류가 발생하기 때문에 재할당을 하려면 var 키워드를 사용해야 한다.

    var f = 123 // WARN: var 키워드를 사용할 경우 한 번 타입이 지정되면 타입을 변경할 수 없다.
//    f = "hi" // WARN: 처음에 Int 타입으로 변수가 선언됐는데 String 타입으로 값을 재할당하려고하면 컴파일 오류가 발생한다.

    x += 1 // 함수 밖에서 선언된 변수를 가져와 사용할 수 있다.
    println(x)
}