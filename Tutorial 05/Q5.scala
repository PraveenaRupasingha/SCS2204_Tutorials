object Q5 {
  def main(args: Array[String]): Unit = {
    println(evenSum(5));
  }

  def isEven(n: Int): Boolean = n match {
    case 0 => true
    case 1 => false
    case _ => isEven(n - 2)
  }

  def evenSum(n: Int): Int = n match {
    case x if x == 0 => 0
    case x if isEven(x) => n + evenSum(n - 2)
    case _ => evenSum(n - 1)
  }
}
