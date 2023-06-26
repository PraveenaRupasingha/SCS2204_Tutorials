import scala.io.StdIn

object Q3 extends App{
  print("Enter num1 : ")
  var num1 = StdIn.readDouble()

  print("Enter num2 : ")
  var num2 = StdIn.readDouble()

  def avg(num1: Double, num2: Double): Double = (num1 + num2) / 2.0

  def round(num: Double): Double = {
    var value = num * 100
    value = (value + 0.5).toInt
    value / 100
  }

  println(avg(num1, num2))
  println(round(avg(num1, num2)))

}
