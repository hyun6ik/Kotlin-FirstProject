open class Human constructor(val name : String = "Anonymous"){

    constructor(name : String, age : Int) : this(name){
        println("my name is ${name}, ${age} years old")
    }

    init{
        println("New human has been born!!")
    }

    fun eatingCake(){
        println("This is so Yummy")
    }

    open fun singASong(){
        println("lalala")
    }
}

class Korean : Human(){
    override fun singASong(){
        super.singASong()
        println("랄라라")
        println("My name is : ${name}")
    }
}




fun main(){


    val korean = Korean()
    korean.singASong()

//    val human = Human("hyunsik")
//
//    var stranger = Human()

//    val human1 = Human("Dongjoo", 22)
//
//    human.eatingCake()
//    println("human.name = ${human.name}")
//    println("stranger.name = ${stranger.name}")

}
