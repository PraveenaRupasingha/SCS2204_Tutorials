object Q2 extends App{
  var a = 2
  var b = 3
  var c = 4
  var d = 5
  var k : Float = 4.3f
  var g : Float = 4.0f

  //println(--b * a + c * d--)     The use of decrement operator is invalid in scala
  //println(a++)                   The use of postfix decrement operator is invalid in scala
  println(-2 * (g-k) + c)
  //println(c = c++)               The use of ++ as a postfix increment operator and assigning the result to the same variable c is not supported in Scala
 //println(c = ++c * a++)          The use of ++ as a postfix increment operator and assigning the result to the same variable c is not valid in Scala

}
