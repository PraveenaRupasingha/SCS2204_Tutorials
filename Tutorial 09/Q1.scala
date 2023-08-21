import scala.io.StdIn

object Q1 extends App{
  print("Enter the numerator: ")
  val x = StdIn.readInt()
  print("Enter the denominator: ")
  val y = StdIn.readInt()

  val nr: Rational = new Rational(x, y);
  println(nr.neg);
}

class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y

  def neg = new Rational(-this.numer, this.denom)

  override def toString = s"$numer/$denom"
}
