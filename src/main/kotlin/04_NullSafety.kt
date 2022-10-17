fun getNullStr(): String? = null

fun getLengthIfNotNull(str: String?) = str?.length ?: 0

/**
 * @see: Java_NullSafety.java
 */
fun main() {

//    val a : String = null
//    var b : String = "aabbcc"
//    b = null

    var a : String? = null // nullable한 타입임을 컴파일러에게 알려준다.
    println(a?.length) // 안전 연산자를 사용하여 null에 대해 안전하게 사용할 수 있다.

    val b : Int = if (a != null) a.length else 0 // 코틀린에서는 삼항연산자가 없기 때문에 if-else식을 사용하면 된다.
    println(b)

    // 엘비스 연산자 ?:는 좌변이 null인 경우 우변을 사용한다.
    val c = a?.length ?: 0
    println(c)

    val nullableStr = getNullStr()

    val nullableStrLength = nullableStr?.length ?: "null인 경우 반환".length
    println(nullableStrLength)

    val length = getLengthIfNotNull(null)
    println(length)

//    throw NullPointerException()

    val d: String? = null
//    val e = d!!.length // 단언 연사자(!!)는 개발자가 봤을 때 null이 발생하지 않는 안전한 코드라고 명시하는 것이다. (WARN: 만약 null일 경우 NPE가 발생함) 단언 연산자는 코드 상 지저분해 보일 수 있기에 많이 쓰이지는 않음

    println(Java_NullSafety.getNullStr()?.length ?: 0) // Java 코드가 null을 반환하는 경우에는 코틀린에서 미리 확인할 수 없기 때문에 안전 연산자와 엘비스 연산자를 사용하는 것이 좋다.
}