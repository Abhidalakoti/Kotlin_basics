interface Base {
    fun printMe()
}

class BaseImpl(val x: Int): Base {
    override fun printMe() {
        println(x)
    }
}
class Derived(b: Base) : Base by b
 fun main(args:Array<String>) {
     val b = BaseImpl(10)
     Derived(b).printMe()
 }