class Product(val name: String, val price: Int)

interface Wheel {

    fun roll()
}

interface Cart : Wheel {

    var coin: Int

    val weight: String
        get() = "20KG" // interface의 경우 Backing Field를 사용할 수 없기 때문에 값을 바로 할당하는 방식만 가능하다.

    fun add(product: Product)

    fun rent() {

        if (coin > 0) {
            println("카트를 대여합니다.")
        }
    }

    override fun roll() {
        println("카트가 굴러갑니다.")
    }

    fun printId() = println("1234")
}

interface Order {

    fun add(product: Product) {
        println("${product.name} 주문이 완료됐습니다.")
    }

    fun printId() = println("5678")
}

class MyCart(override var coin: Int) : Cart, Order { // class의 상속인 경우 생성자 호출 `()`이 추가되지만 interface의 경우 없다.

    override fun add(product: Product) {

        if (coin <= 0) println("코인을 넣어주세요.")
        else println("${product.name}이(가) 카트에 추가됐습니다.")

        // 주문하기
        super<Order>.add(product) // 동일한 메서드명을 가진 interface를 가진 경우에는 super 키워드에 꺽쇄(<>)를 이용하여 상위 클래스를 지정할 수 있다.
    }

    override fun printId() {

        super<Cart>.printId()
        super<Order>.printId()
    }

}

fun main() {

    val cart = MyCart(coin = 100)
    cart.rent() // 카트를 대여합니다.
    cart.roll() // 카트가 굴러갑니다.
    cart.add(Product(name = "장난감", price = 1000)) // 장난감이(가) 카트에 추가됐습니다.
    cart.printId()
}