package factory.abstractFactory

class CarAssembler(factory: CarPartsFactory) {
    private val engine: Engine = factory.createEngine()
    private val body: Body = factory.createBody()

    fun assembleCar() {
        body.create()
        engine.assemble()
        println("자동차 조립 완료!")
    }
}