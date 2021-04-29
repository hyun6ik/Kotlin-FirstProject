class HelloKotlin {

}
fun main(){
    helloWorld()
    val add = add(4, 5)
    print(add)
}

/**
 * 함수
 */

fun helloWorld() {
    println("Hello World")
}

fun add(a : Int, b : Int) : Int{
    return a+b
}


/**
 * val VS var
 */
