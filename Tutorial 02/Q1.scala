object Q1 extends App{
  var k, i, j = 2
  var m, n = 5
  var f : Float = 12.0f
  var g : Float = 4.0f
  var c : Char= 'X'

  println(k + 12 * m)
  println(m / j)
  println(n % j)
  println(m / j * j)
  println(f + 10*5 +g)
  //println(++i * n)
  /* '++' operator is not supported in scala.
  Instead, we can use functional approach as following */

  println((i+1) * n)
}
