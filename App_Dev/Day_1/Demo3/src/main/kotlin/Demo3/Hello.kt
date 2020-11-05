package Demo3
/*
Kotlin String Task:
For this task, you are to implement 3 methods that manipulate string objects. Avoid using arrays or methods you have yet to be taught as this defeats the purpose of the exercise.
a.	Method 1: When given a String, count and return how many words there are in that String.
b.	Method 2: When given a String, print out this String in a vertical fashion, each word on a different line.
c.	Method 3: As above but reverse the order.
 */
fun method1(input : String){
    var numWords = input.split(' ').size
    println("There are $numWords words in the sentence: $input")
    println("There are ${input.count()} characters in the sentence: $input")
}

fun method2(input : String){
    print("\n$input -> becomes:\n")
    for (i in input) {
        println(i)
    }
}

fun method3(input : String){
    print("\n$input -> becomes:\n")
    for (i in input.reversed()) {
        println(i)
    }
}

fun main(args: Array<String>) {
    method1("Hello, World")
    method2("Hello, World")
    method3("Hello, World")
}

