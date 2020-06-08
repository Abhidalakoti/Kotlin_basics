interface one {
    fun printnow() {
        println("Method one ")
    }
}
interface two {
    fun printnow1() {
        println("Method two ")
    }
}

class Multiple_interfaces : one , two

fun main(args: Array<String>){
    val obj =  Multiple_interfaces()
    obj.printnow1()
    obj.printnow()
}
