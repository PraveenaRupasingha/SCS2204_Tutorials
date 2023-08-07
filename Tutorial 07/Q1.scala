object Q1 extends App{

  def filterEvenNumbers(input: List[Int]): List[Int] = {
    input.filter(num => num % 2 == 0)
  }
  val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val output = filterEvenNumbers(input)
  println(output.mkString(", "))
}
