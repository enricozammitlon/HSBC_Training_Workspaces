package Demo2
import Hello2.testvar

// good for nullable types
lateinit var str2: String

fun testPrint(str: String): String {
    return str.also(::println)
}

fun testPrint2(str: String): String {
    return str.also{str2 = "Jerry"}
}

fun testPrint3(str: String): Boolean {
    return str is String
}

fun main(args: Array<String>) {
    println("Hello, World")
    testPrint("hi")
    testPrint(str2)
    print("Hello $testvar")
}
