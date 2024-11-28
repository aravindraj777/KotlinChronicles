

fun escapedString(){
    val s = "Hello, world!\n"

    print(s)
}

fun multilineStrings(){

    val text = """
    Hello, Aravind!
    This is an example of a "multiline string."
    Use it to write whatever you want: text, symbols, or even code snippets.
    
    Kotlin is fun! 😊
"""

    print(text)

    val newTestText = """
       Hi 
       Hello
       This is a test function
    """

    print(newTestText)


    val textNew = """
    for (c in "foo")
        print(c)
    """

    print(textNew)


    val textTrimMargin = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()

    print(textTrimMargin)
}


fun stringTemplates(){

    val s = "abc"
    println("$s has a length of ${s.length}")
}