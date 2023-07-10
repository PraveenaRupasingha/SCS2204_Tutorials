object Q4 {
  def main(args: Array[String]): Unit = {
    oddOrEven(5)
    oddOrEven(8)
  }

  def oddOrEven(n: Int): Unit = n match {
    case 0 => println("Even")
    case 1 => println("Odd")
    case _ => oddOrEven(n-2)
  }
}
