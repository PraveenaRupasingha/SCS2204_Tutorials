object Q2 extends App{
  val x: Rational2 = new Rational2(3, 4);
  val y: Rational2 = new Rational2(5, 8);
  val z: Rational2 = new Rational2(2, 7);

  println(x.sub(y).sub(z));
}

class Rational2(x: Int, y: Int) {
  def numer = x

  def denom = y

  def sub(r: Rational2) =
    new Rational2(numer * r.denom - r.numer * denom, denom * r.denom)

  override def toString = s"$numer/$denom"
}
