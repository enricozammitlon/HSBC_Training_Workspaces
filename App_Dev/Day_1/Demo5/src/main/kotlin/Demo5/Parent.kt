package Demo5

interface Parent {
  val eyeColour: String
    get() = "blue"
  val hairColour: String
    get() = "black"
  fun eyeColour(){
    println(eyeColour)
  }
  fun hairColour(){
    println(hairColour)
  }
}
