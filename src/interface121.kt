fun main(args: Array<String>) {
    var programmer: Human2 = object : Human2 {
        override fun think() {
            print("Example of anonymous Inner class")
        }
    }
    programmer.think()
}
interface Human2{
    fun think()
}