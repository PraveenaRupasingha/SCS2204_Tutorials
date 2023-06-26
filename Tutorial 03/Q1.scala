import scala.io.StdIn

object Q1 {
  def main(args: Array[String]): Unit = {
    println("Enter the string: ")
    var str = StdIn.readLine()

    println(reversefunc(str))
  }

  def reversefunc(str: String): String= {
    if(str.length<=1) {
       str
   }
   else{
     reversefunc(str.substring(1))+ str.charAt(0)
   }
  }
}
