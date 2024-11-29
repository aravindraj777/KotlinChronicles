package oops

class ClassesAndConstructors(val myVal: String){
    constructor(myInt: Int): this("From secondary"){
        println("MyInt $myInt")
    }

    init {
        println("This is from primary constructor $myVal")
    }


}