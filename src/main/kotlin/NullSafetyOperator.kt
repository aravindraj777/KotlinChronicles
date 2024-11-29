
fun nullSafeOperator(){

    /**
     When we write like this , the variable can be assigned with a null value and the actual value
     */
    val nullable: String? = null
    println(nullable)

    /**
        In this we can assign null value as well as not null value
     */
    var nonNullable:String? = "Hello"
    if (nonNullable == null){
        nonNullable = null
        println("This is a null assignment")
    }
    else{
      nonNullable = "Haii"
      println(nonNullable)
    }

    println(nonNullable)
}