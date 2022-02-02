fun main(args: Array<String>) {
    /*
    Step 1. 인사말 출력
    Step 2. 사용자 이름 받기
    Step 3. 입력받은 사용자 이름 출력
     */
    println("안녕! 코틀린 정복하자")
    println("너의 이름은? : ")

    val name = readLine()
    println("""
        반가워요 $name 님
        원하시는 카테고리를 입력해주세요.
        ===============================***
    """.trimIndent())

    /*
    Step 1. 상품 카테고리 표기
    Step 2. 사용자 입력 받기
    Step 3. 사용자가 기대하는 값을 입력하지 않는 경우에 대한 처리
     */
    val categories = arrayOf("패션","전자기기","반려동물용품")
    for (category in categories){
        println(category)
    }
    println("=> 장바구니로 이동하려면 #을 입력해주세요")

    var selectedCategory = readLine()
    while (selectedCategory.isNullOrBlank()){
        println("걊을 입력해주세요")
        selectedCategory = readLine()
    }
    if (selectedCategory == "#"){
        // TODO 1. 장바구니 이동
    } else {
        // TODO 2. 카테고리 상품 목록 보여주기
        // TODO 3. 카테고리 목록에 없는 값을 입력하는 경우
    }
}