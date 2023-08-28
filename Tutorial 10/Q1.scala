import scala.io.StdIn

object Q1 extends App{

  print("Enter a list of integers separated by , : ")
  val input = StdIn.readLine()
  val cel = input.split(",").map(_.toDouble).toList

  println("Average Fahrenheit temperature: " + calculateAverage(cel))

  def calculateAverage(cel: List[Double]) : Double = {
    val fah = cel.map(c => (c * 9 / 5) + 32)
    fah.reduce((x, y) => (x + y)) / fah.length.toDouble
  }

}
