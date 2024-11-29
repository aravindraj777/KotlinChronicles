package collections

fun mapLearn(){

    val myMap = mapOf("Hello" to "one", "Hai" to "two")
    println(myMap)

    val key = "Hell"
    if (key in myMap){
        println(myMap[key])
    }
    else
    {
        println("There is no value for this key")
    }
}