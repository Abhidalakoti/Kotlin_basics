fun main(args: Array<String>)
{
    val book : Book = Book("Kotlin" , "Tutorials" , 5)
    println("Name of book :"+book.name)
    println("publisher of the book:"+book.publisher)
    println("Reviewer of the book:"+book.reviewscore)
    book.reviewscore = 7
    println("Printing all the info:"+book.toString())
    //inbuilt function of data class

    println("Example of hashcode:"+book.hashCode())

}


data class Book(val name: String, val publisher: String ,  var reviewscore: Int)