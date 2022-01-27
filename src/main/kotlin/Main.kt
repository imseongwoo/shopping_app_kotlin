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

}