interface ExampleInterface {
    var myVar : Int
    fun method1():String
    fun hello(){
        println("Hello there, It's Abhinav here")
    }
}

class InterfaceImplement : ExampleInterface {
    override var myVar: Int = 25
    override fun method1() = "Learn Kotlin"
}

fun main(args: Array<String>)
{
    val obj = InterfaceImplement()
    println("The variable value is = ${obj.myVar}")
    print("Calling hello():")
    obj.hello()

    print("Message from the website--")
    println(obj.method1())
}