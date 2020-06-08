import java.util.Arrays
open class Inheritance12 {
    fun tinker(){
        print("Life is good")
    }
}

class Inheritance21: Inheritance12() {}
    fun main(args: Array<String>){
        var a = Inheritance21()
        a.tinker()
    }
