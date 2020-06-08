fun main(args: Array<String>) {
    val p = Player("Tendulkar", "Dravid")
    val (name1, name2) = p
    println ("India won" + " with scores from " + name2+ " & " + name1)
}
data class Player(val a:String , val b:String){
    var name1 : String = a
    var name2 :String = b
}