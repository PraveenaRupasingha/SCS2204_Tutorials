object Q2 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ");
    var input = scala.io.StdIn.readInt();
    println(inputType(input));
  }

  def inputType(n : Int): String= n match{
    case x if x<0 => "Negative"
    case x if x==0 => "Zero"
    case x if x%2==0 => "Even"
    case _  => "Odd"
  }
}
