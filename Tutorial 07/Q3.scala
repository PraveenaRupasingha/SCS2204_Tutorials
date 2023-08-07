object Q3 extends  App{
  def isPrime(num: Int): Boolean = {
    if (num <= 1) false
    else if (num == 2) true
    else !(2 to Math.sqrt(num).toInt).exists(x => num % x == 0)
  }

  def filterPrime(input: List[Int]): List[Int] = {
    input.filter(num => isPrime(num))
  }
  val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val output = filterPrime(input)
  println(output.mkString(", "))
}
