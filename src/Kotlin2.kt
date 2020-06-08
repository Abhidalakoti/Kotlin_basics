fun main(args: Array<String>)
{
    println("Hello World")
    val items = listOf(1,2,3,4)
     println("First Element of our list----"+items.first())
    println("Last Element of list---"+items.last())
    println("Even Numbers of our List"+ items.filter{ it % 2 == 0})
    val readWriteMap = hashMapOf("foo" to 1, "bar" to  2)
    println(readWriteMap["foo"])
    val strings = hashSetOf("a", "b","c", "c")
    println("My set Values are"+strings)
}