package variables
fun main() {
    val str = "This is a string"
    val str1 = "to say something within a string \"use this\" "
    val str2 = "to print a string on a new line use \"\\n\" within a string"
    val str3 = "to use a backspace try the \"\\b\" command"
    val str4 = "use a return to cut the sentence with the \"\\r\" command"
    var str5 = """
        -this is a multi-line string..
        -The prefix margin can be set using the following
        -The end of my quoting""".trimMargin(marginPrefix = "-")
    var str6 = """by default
        |press enter to start a new line
        |like this
        |:D
    """.trimMargin()
    print(str5)
//    println("$str1, $str2,  $str3, $str4 \n \n")
//
//    println("Take advantage of interpolation, out use the $: $str")
//
//    println("We can also use expressions here, $str has ${str.count()} chars")
    //////////////////////////////////////// Conversions ////////////////////////////////////////
    var upper = str.toUpperCase()
    var lower = str.toLowerCase()
    val sub = str.subSequence(4, 16)
//    println("this is the parts I asked for: " + sub)
    //////////////////////////////////////// Assertions /////////////////////////////////////////
    val assertStr = str.contentEquals("This is a string")
//    print(assertStr)
    val containsStr = str.contains("string")
//    print(containsStr)
    val containsStrSpecifyCase = str.contains("String", false)
//    print(containsStrSpecifyCase)
}