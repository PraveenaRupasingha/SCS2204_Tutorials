object Q1 extends App{
  println(calInterest(250))
  println(calInterest(25000))
  println(calInterest(250000))
  println(calInterest(2500000))
  println(calInterest(2000000))
  println(calInterest(0))

  def calInterest(deposit: Double): Double = deposit match {
    case x if x >= 2000000 => 0.065 * x
    case x if x < 20000 => 0.02 * x
    case x if x < 200000 => 0.04 * x
    case x if x < 2000000 => 0.035 * x
  }
}
