package factory.factoryMethod

fun main() {
    val benzFactory = BenzFactory()
    val audiFactory = AudiFactory()

    benzFactory.orderCar("E-Class")
    println("=====================================")
    println("주문 완료")

    audiFactory.orderCar("A6")
    println("=====================================")
    println("주문 완료")
}