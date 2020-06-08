fun main(args: Array<String>)
{
    val newlambda : (String) -> Unit = {s:String-> print(s)}
    val v:String = "Abhi"
    newfun(v, newlambda)
}

fun newfun(a: String, action: (String) -> Unit) {
    println("Hi Abhi!!!")
    action(a)
}