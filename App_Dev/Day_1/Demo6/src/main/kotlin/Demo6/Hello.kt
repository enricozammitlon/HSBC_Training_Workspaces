package Demo6
//// Lists ////
val names = listOf<String>("You", "Can't", "Add", "To", "This", "List")
val mutableNames = mutableListOf<String>("Ed", "Shafeeq", "Tony", "John")
val numbers = (0..20).toMutableList()
//// Sets ////
val setNumber = setOf(1, 2, 3, 4, 5, 6)
val count = setNumber.count()
val max = setNumber.max()
//// Maps ////
val firstMap = mutableMapOf<Int, String>(0 to "Value0", 1 to "Value1", 2 to "Value2")
val secondMap = mapOf<Int, String>(0 to "Value0", 1 to "Value1", 2 to "Value2")
//// Hashmap ////
val hashDemo = hashMapOf<Int, String>(0 to "Value1", 1 to "Value2")
fun main() {
    hashDemo[0] = "key0"
    hashDemo[1] = "Key1"
    hashDemo.remove(0)
    println(firstMap[0])
    println(firstMap.getOrDefault(5, 1))
    firstMap.put(0, "Value")
    println(firstMap)
    println(firstMap.clear())
    println(numbers union setOf(21, 22))
    println(numbers intersect setOf(10, 11))
    println(numbers subtract setOf(5, 6))
    println(max)
    println("The min within this set is : ${setNumber.min()}")
    println(names)
    mutableNames.add("Ali")
    println(mutableNames)
    println("${names[1]}, ${names[0]}")
    print(numbers)
    println("\n" + numbers.getOrNull(21))
    println(numbers.subList(4, 10))
}