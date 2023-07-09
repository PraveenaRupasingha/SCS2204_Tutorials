object Q3 extends App{
  var sum = 0

  def getSum(n : Int): Int = {
    sum += n
    if(n==1) return sum
    else getSum(n-1)
  }

  println(getSum(5))
}
