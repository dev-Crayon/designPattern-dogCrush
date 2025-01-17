
fun main(): Unit {
    val displayProductService = DisplayProductService(
        ShopProductService(),
        CServiceProductService()
    )

    println(displayProductService.getDisplayProduct("a", "1"))
    println(displayProductService.getDisplayProduct("c", "2"))
}

class DisplayProductService(
    private val shopProductService: ShopProductService,
    private val cServiceProductService: CServiceProductService,
) {
    fun getDisplayProduct(type: String, id: String): DisplayProduct {
        if (type == "a" || type == "b") {
            return shopProductService.getShopProduct(id)
        } else if (type == "c") {
            // ----- Adapter -----
            val cProduct = cServiceProductService.getCServiceProduct(id.toLong())

            return DisplayProduct(
                id = cProduct.id.toString(),
                name = cProduct.name,
                review = cProduct.review,
            )
            // --------------------
        }

        TODO()
    }
}


