class HelloKotlin {

}
fun main(){
//    helloWorld()
//    val add = add(4, 5)
//    print(add)

    //3. String template
//    val name = "Hyunsik"
//    val lastName = "Yoon"
//    println("My name is ${name + lastName} I'm Twenty-seven")
//    println("is this true? ${1==0}")
//
//    println("this is 2\$a")

    val maxBy2 = maxBy2(5, 4)
    println("maxBy2 = ${maxBy2}")
    checkNum(2)


}

/**
 * Array and List
 * Array 크기가 정해져 있음
 * List
 * 1. List : 수정 불가능한 리스트
 * 2. MutableList : 수정 가능한 리스트
 */
fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1,"d",3.4f)
    var list2 = listOf(1,"d",11L)

    array[0] = 3
    val get = list.get(0)

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)


}

/**
 * Expression vs Statement
 * 값을 만들면 Expression
 * Kotlin의 모든 함수는 Expression
 *
 */



/**
 * 4. 조건식
 */
fun maxBy(a : Int, b: Int) : Int {
    if (a > b){
        return a
    } else {
        return b
    }

}

fun maxBy2(a : Int, b: Int) = if(a>b) a else b

fun checkNum(score : Int) {
    when (score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
        else -> println("I don't know")
    }

    var b = when(score){
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b = ${b}")

    when(score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("bad")
    }

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
 * 2. val VS var
 * val = value
 * var = variable
 */
fun hi(){
    val a: Int = 10
    var b : Int = 9
    b = 100
    val c = 100
    var d = 100

    var name = "hyunsik"

    //val: 발은 뗄수 없다 = 고칠수 X
    //var : 바지는 갈아 입을 수 있다 = 고칠수 O
}


