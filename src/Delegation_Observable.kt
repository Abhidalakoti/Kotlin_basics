import kotlin.properties.Delegates
class User {
    var name: String by Delegates.observable("Haha"){
        prop, old , new ->
        println("$old -> $new")
    }
}

fun main(args: Array<String>){
    val user = User()
    user.name = "Gru"
    user.name = "Dru"
}