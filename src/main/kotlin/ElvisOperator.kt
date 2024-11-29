
fun elvisOperator(){

    /**
     Elvis operator is used when we want to assign a default value incase where there is chance
      of having a null value , it helps to check the null safety
     * */
    val myVar:Int? = null
    println(myVar ?: "This is the default value")
}