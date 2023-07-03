object Q3{

  def main(args: Array[String]): Unit = {
    println(formatNames("Benny", toUpper))
    println(formatNames("Niroshan", (name: String) => name.substring(0, 1) + toUpper(name.substring(1, 2)) + name.substring(2)))
    println(formatNames("Saman", toLower))
    println(formatNames("Kumara", (name: String) => name.substring(0, 5) + toUpper(name.substring(5))))
  }

  def toUpper(str : String): String = str.toUpperCase()
  def toLower(str: String): String = str.toLowerCase()
  def formatNames(name: String, callBack: String => String): String = callBack(name)
}
