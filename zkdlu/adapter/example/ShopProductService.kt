import ShopProduct

class ShopProductService(
    private val reviewRepository: ReviewRepository,
    private val shopProductRepository: ShopProductRepository,
) {
    fun getShopProduct(id: String): DisplayProduct {
        // --- FACADE ----
        val shopProduct = shopProductRepository.getShopProduct(id)
        val review = reviewRepository.getReview(id)

        return DisplayProduct(
            id = shopProduct.id,
            name = shopProduct.name,
            review = review,
        )
        // ----------------
    }
}

class ReviewRepository {
    fun getReview(id: String): Int = 5
}

class ShopProductRepository {
    fun getShopProduct(id: String): ShopProduct {
        return ShopProduct(
            id = "1",
            name = "Shop Product"
        )
    }
}

data class ShopProduct(
    val id: String,
    val name: String,
)