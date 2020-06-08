import java.awt.geom.Arc2D
/*
sealed class Expr{
    class Example1 : Expr()
    class Example2 : Expr()

}

/*fun main(args : Array<String>)
{
    val obj: Expr = Expr.Example1()
    val output = when(obj){
        is Expr.Example1 -> "Example 1"
        is Expr.Example2 -> "Example 2"

    }

    println(output)

}*/
/*data class Const(val number: Double) : Expr()
data class Sum(val e1:Expr, val e2:Expr):Expr()
object NotANumber : Expr()


fun eval(expr: Expr) : Double = when(expr) {
    is Const -> "It is constant"
    is Sum -> "It is sum"
    NotANumber -> "It is nan"


}

*/