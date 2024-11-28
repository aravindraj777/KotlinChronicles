package collections

fun setLearn(){
    val mySet = setOf<String>("One", "Two", "One")
    println(mySet)

    val newSetCreation : MutableSet<String> = HashSet()
    newSetCreation.add("Three")
    println(newSetCreation)
}