package Demo4

//Null value checking:
fun main() {
    var isNotNull: String = "I can't be null"
    var isNull: String? = null
    var size = 0
    //null check
    size = isNull?.length ?: -1
    println(size)
    //null check, safe call operator
    println(isNull?.length)
    //Elvis Operator
    size = isNull?.length ?: -2
    println(size)
    //!! only used when you're aware of the value
    val l = isNull!!.length
    isItNull(null)
    FullName("bob", "jones")
    MoreNames("first", second = "second")
}