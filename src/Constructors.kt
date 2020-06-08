


fun main(args: Array<String>) {
    val person1 = Person("Abhinav", 25)
    println("First Name = ${person1.firstName}")
    println("Age = ${person1.age}")
    val Human1 = Human("Abhinav12", 25)
        print("${Human1.message}" +"${Human1.firstName}"+"Welcome to example of secondary constructor, Your age is -${Human1.age}")


}

class Person(val firstName: String, var age: Int) {

}

class Human(val firstName: String, var age: Int ){
    val message:String = "Hey!!!"
    constructor(name: String, age: Int, message:String):this(name,age) {

    }
}