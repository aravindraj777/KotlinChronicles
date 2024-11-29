package oops.polymorphism

open class Parent {

    open fun parentMethod(){
        println("This is a parent method")
    }
}

class Child(): Parent() {
    override fun parentMethod() {
        println("This is the parent invocation inside child class")
        super.parentMethod()
    }
}

fun main() {
    val child = Child()
    child.parentMethod()
}