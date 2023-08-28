import scala.io.StdIn

object Q2 extends App{

  print("Enter a list of words separated by , : ")
  val input = StdIn.readLine().split(",").toList

  print("Total count of letter occurrences: " + countLetterOccurrences(input))

  def countLetterOccurrences(input: List[String]): Int = {
    input.map(str => str.length).reduce((x,y) => x+y)
  }

}
