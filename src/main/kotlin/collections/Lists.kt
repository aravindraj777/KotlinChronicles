package collections

fun listLearn(){
    val myList = listOf("One", "Two", "Three")
    val readOnly: MutableList<String> = myList.toMutableList()
    print(myList)

}