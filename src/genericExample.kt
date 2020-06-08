fun main(args: Array<String>) {
    val integer: Int = 1
    val number: Number = integer
    print(number)
    var object2 = genericExample<String>("JAVA")
    var object1 = genericExample<Int>(10)
    println(object2)
    println(object1)
}
    class genericExample<T>(input:T){
        init {
            println("I am getting called with the value "+input)
        }
    }


