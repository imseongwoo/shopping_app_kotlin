package screen

import extension.getNotEmptyString

class ShoppingCategory {

    public fun showCategories() {
        val categories = arrayOf("패션", "전자기기", "반려동물용품")
        for (category in categories) {
            println(category)
        }
        println("=> 장바구니로 이동하려면 #을 입력해주세요")

        val selectedCategory = readLine().getNotEmptyString()

        if (selectedCategory == "#") {
            // TODO 1. 장바구니 이동
            val shoppingCart = ShoppingCart()
            shoppingCart.showCartItems()
        } else {
            if(categories.contains(selectedCategory)){
                // TODO 2. 카테고리 상품 목록 보여주기
                val shoppingProductList = ShoppingproductList()
                shoppingProductList.showProducts(selectedCategory)

            }else{
                // TODO 3. 카테고리 목록에 없는 값을 입력하는 경우
                showErrorMessage(selectedCategory)
            }
        }
    }

    private fun showErrorMessage(selectedCategory: String?) {
        println("[$selectedCategory] : 존재하지 않는 카테고리입니다.")
        showCategories()
    }
}