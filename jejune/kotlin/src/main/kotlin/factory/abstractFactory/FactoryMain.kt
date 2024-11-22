package factory.abstractFactory

fun main() {
    // 벤츠 자동차 생산
    val benzFactory = BenzPartsFactory()
    val benzAssembler = CarAssembler(benzFactory)
    benzAssembler.assembleCar()

    // 아우디 자동차 생산
    val audiFactory = AudiPartsFactory()
    val audiAssembler = CarAssembler(audiFactory)
    audiAssembler.assembleCar()
}