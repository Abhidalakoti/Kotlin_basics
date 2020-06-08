fun main(args: Array<String>)
{
    try{
        val var1 : Int = 12;
        val v : String = "Laxman";
        v.toInt();
    }catch(e: Exception){
        e.printStackTrace();
    }finally{
        println("exception handled");
    }
}