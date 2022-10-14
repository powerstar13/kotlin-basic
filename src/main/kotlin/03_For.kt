fun main() {
    // 범위 연산자 `..`를 사용해 for loop 돌리기
    for (i in 0 .. 3) {
        println(i) // 0 1 2 3
    }

    println("--------------------------")

    // until을 사용해 반복한다.
    // 뒤에 온 숫자는 포함하지 않는다.
    for (i in 0 until 3) {
        println(i) // 0 1 2
    }

    println("--------------------------")

    // step에 들어온 값만큼 증가시킨다.
    for (i in 0 .. 6 step 2) {
        println(i) // 0 2 4 6
    }

    println("--------------------------")

    // downTo를 사용해 반복하면서 값을 감소시킨다.
    for (i in 3 downTo  1) {
        println(i) // 3 2 1
    }

    println("--------------------------")

    // 전달받은 배열을 반복
    val numbers = arrayOf(1, 2, 3)

    for (i in numbers) {
        println(i) // 1 2 3
    }
}