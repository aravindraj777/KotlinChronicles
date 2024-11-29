package oops.inheritance

open class Inheritance {

    var property = "Property"
    fun parentMethod(){
        println("This is a parent method")
    }

}

class Child: Inheritance() {
//    var parentObj = Inheritance()
//    fun childMethod(){
//        parentObj.parentMethod()
//    }

}

fun main(){

    val childObj = Child()
    childObj.parentMethod()

}