sealed class Expr1{
    class Example1 : Expr1()
    class Example2 : Expr1()

}

fun main(args : Array<String>)
{
    val obj: Expr1 = Expr1.Example1()
    val output = when(obj){
        is Expr1.Example1 -> "Example 1"
        is Expr1.Example2 -> "Example 2"

    }

    println(output)

}