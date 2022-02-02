package screen

class ShoppingHome {

    fun start(){
        showWelcomeMessage()
        showCategories()
    }

    private fun showCategories() {
        val shoppingCategory = ShoppingCategory()
        shoppingCategory.showCategories()
    }

    private fun showWelcomeMessage() {
        println("안녕! 코틀린 정복하자")
        println("너의 이름은? : ")

        val name = readLine()
        println(
            """
            반가워요 $name 님
            원하시는 카테고리를 입력해주세요.
            ===============================***
        """.trimIndent()
        )
    }
}