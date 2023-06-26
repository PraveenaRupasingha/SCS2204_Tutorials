import scala.io.StdIn

object Q2 {

  def main(args: Array[String]) = {
    println("Enter the list of string: ")
    val str = StdIn.readLine()
    filter(str.split(" "))
  }

  def filter(arr: Array[String]): Unit = {
    if (arr.length > 0) {
      if (arr(0).length > 5) {
        print(arr(0) + " ")
      }
      filter(arr.slice(1, arr.length))
    }
  }
}
