// 코틀린에서는 constructor 키워드를 사용할 수 있으며, 생성자 키워드를 생략할 수도 있다. (생략하는 것이 가독성이 더 좋다. 특정 애노테이션을 사용할 때에는 constructor 키워드를 사용하는 경우가 있지만 그런 경우가 아니라면 굳이 사용할 필요가 없다.)
class Coffee(
    var name: String = "", // var 타입으로 선언하면 getter/setter가 존재하지만, val 타입으로 선언하면 setter는 존재하지 않고 getter만 존재하게 된다.
    var price: Int = 0, // 후행 쉼표를 쓰게되면 나중에 확장될 것을 미리 대비할 수 있다. (코드 리뷰 시에도 2줄의 변화보다 1줄의 변화만을 볼 수 있기 때문에 좀 더 유용하기에 후행 콤마(,)를 붙여주는 것을 추천한다.)
    var iced: Boolean = false,
) {
    val brand: String
        //        get() = "스타벅스" // custom getter (값을 바로 할당할 수도 있고 아래처럼 본문을 통해 값을 반환할 수도 있다.)
        get() {
            return "스타벅스"
        }

    var quantity: Int = 0 // 커피의 수량
        set(value) {
            // 수량이 0 이상인 경우에만 할당
            if (value > 0) field = value // 코틀린에서는 field 식별자를 통해 getter/setter의 실제 필드에 접근할 수 있다. (이를 backing field에 접근한다고 말한다.)
            // WARN: 만약 field 식별자가 아닌 quantity 변수명에 직접 값을 할당하려고 할 경우 set() 메서드에 무한 재귀 함수로 작동하게 되므로 StackOverflowError를 발생하게 된다.
        }
}

class EmptyClass // 본문 내용이 없는 클래스도 만들 수 있다.

/**
 * @see Java_Coffee
 */
fun main() {

    val coffee = Coffee() // 코틀린에서는 getter/setter가 눈에 보이지 않아도 컴파일러에 의해 기본적으로 사용할 수 있도록 된다. 디컴파일러를 해보면 getter/setter 코드가 존재하는 것을 확인할 수 있다.
    coffee.name = "아이스 아메리카노" // setter를 통해 값을 세팅할 수 있다.
    coffee.price = 2000
    coffee.quantity = 1
    coffee.iced = true

    if (coffee.iced) { // 자바에서는 getter 메서드를 통해 프로퍼티의 값을 읽어 오지만 코틀린은 프로퍼티로 읽어온다는 점에서 객체지향주의에 좀 더 적합하다는 것으로 코틀린이 홍보된다.
        println("아이스 커피")
    }

    println("${coffee.brand} ${coffee.name} 가격은 ${coffee.price} 수량은 ${coffee.quantity}") // getter를 통해 값을 읽을 수 있다.
}