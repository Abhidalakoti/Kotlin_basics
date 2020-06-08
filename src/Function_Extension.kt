class New1{
    var skillset : String = "null"

    fun printskillset() {
        print(skillset)
    }
}

fun main(args: Array<String>){
    var a1 = New1()
    a1.skillset = "PHP"

    var a2 = New1()
    a2.skillset = "Mongo"

    var a3 = New1()
    a3.skillset = a1.addskillset(a2)
    a3.printskillset()
}

fun New1.addskillset(a: New1):String {
    var  a4 = New1()
    a4.skillset = this.skillset+ " " + a.skillset
    return a4.skillset
}