object Q2 extends App{
  def calculateSquare(input : List[Int]):List[Int]={
    input.map(num => num * num)
  }

  val input = List(1, 2, 3, 4, 5)
  val output = calculateSquare(input)
  println(output.mkString(", "))
}
