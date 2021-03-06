package screen
import data.CartItems
import data.Product
import extension.getNotEmptyInt
import extension.getNotEmptyString

class ShoppingproductList {
    private val products = arrayOf(
        Product("패션","겨울패딩"),
        Product("패션","겨울바지"),
        Product("전자기기","핸드폰"),
        Product("전자기기","블루투스 이어폰"),
        Product("전자기기","노트북"),
        Product("반려동물용품","건식사료"),
        Product("반려동물용품","습식사료"),
        Product("반려동물용품","치약"),
        Product("반려동물용품","간식")

    )
    private val categories: Map<String, List<Product>> = products.groupBy { product ->
        product.categoryLabel
    }

    fun showProducts(selectedCategory: String){
        val categoryProducts = categories[selectedCategory]
        if (!categoryProducts.isNullOrEmpty()){
            println("""
                ***+=====================================
                선택하신 [$selectedCategory] 카테고리 상품입니다.
            """.trimIndent())
            val productSize = categoryProducts.size
            for (index in 0  until  productSize){
                println("${index}. ${categoryProducts[index].name}")
            }
            categoryProducts.forEachIndexed{ index, product ->
                println("${index}. ${categoryProducts[index].name}")
            }
            showCartOption(categoryProducts,selectedCategory)
        } else{
            showEmptyProductMesssage(selectedCategory)
        }
    }

    private fun showCartOption(categoryProducts: List<Product>,selectedCategory: String) {
        println(
            """
                ==================================
                장바구니에 담을 상품 번호를 선택해주세요.
            """.trimIndent()
        )

        val selectedIndex = readLine().getNotEmptyInt()
        categoryProducts.getOrNull(selectedIndex)?.let { product ->
            CartItems.addProduct(product)
            println("=> 장바구니로 이동하려면 #, 계속 쇼핑하려면 * 입력")
            val answer = readLine().getNotEmptyString()
            if (answer == "#"){
                val shoppingCart = ShoppingCart()
                shoppingCart.showCartItems()
            } else if (answer == "*"){
                showProducts(selectedCategory)
            } else {
                // 그 외 값 입력 경우
            }
        }
    }

    private fun showEmptyProductMesssage(selectedCategory: String){
        println("[$selectedCategory] 카테고리의 상품이 등록되기 전입니다.")
    }

}