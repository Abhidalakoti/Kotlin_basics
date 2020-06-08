import java.util.Arrays

open class Inheritance1 {
    open fun tinker (){
        print("Hey abhinav")
    }
}

class  Inheritance2: Inheritance1() {
    override fun tinker(){
        print("This is inheritance overriding")
    }
}

fun main(args:Array<String>)
{
    var new1 = Inheritance2()
    new1.tinker()
}