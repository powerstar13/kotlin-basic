enum class PaymentStatus(val label: String) : Payable {

    UNPAID("미지급") {
        override fun isPayable(): Boolean = true
    },
    PAID("지급") {
        override fun isPayable(): Boolean = false
    },
    FAILED("지급실패") {
        override fun isPayable(): Boolean = false
    },
    REFUNDED("환불") {
        override fun isPayable(): Boolean = false
    }; // 상수 목록 뒤에 함수를 추가하고 싶은 경우 세미콜론(;)을 명시해야 한다.

//    abstract fun isPayable(): Boolean // enum class 안에서 abstract를 통해 추상 메서드를 작성하기 보다 interface로 빼내어 구현하는 것이 좋다.
}

interface Payable {
    fun isPayable(): Boolean
}

fun main() {

    if (PaymentStatus.UNPAID.isPayable()) println("결제 가능 상태")

    val paymentStatus = PaymentStatus.valueOf("PAID")
    println(paymentStatus.label)

    if (paymentStatus == PaymentStatus.PAID) println("결제 완료 상태")

    for (status in PaymentStatus.values()) {

        println("[${status.name}](${status.label}) : ${status.ordinal}")
    }
}