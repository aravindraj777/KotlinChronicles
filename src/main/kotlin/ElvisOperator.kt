import java.lang.Exception

fun elvisOperator(){

    /**
     Elvis operator is used when we want to assign a default value incase where there is chance
      of having a null value , it helps to check the null safety
     * */
    val myVar:Int? = null
    println(myVar ?: "This is the default value")
}

fun assertionOperator(){

    /**
     This will throw KotlinNullPointerException
     */
    try {
        val name: String? = null
        val result = name!!
        println(result)

    }
    catch(e:Exception){
        println("Caught nullPointerException ${e.message}")
    }

    /**
     This will not throe exception ,
     if the value is null it will throw
     */
    val strName: String? = "Arvind"
    val resultant = strName!!
    println(resultant)


}