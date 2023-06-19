object Q3 {

  def main(args: Array[String]) = {
    println(takeHomeSalary(40, 30))
  }

  def normalHour(noOfHours: Double): Double = 250 * noOfHours

  def OTHour(noOfOTHours: Double): Double = 85 * noOfOTHours

  def beforeTax(noOfHours: Double, noOfOTHours: Double): Double = normalHour(noOfHours) + OTHour(noOfOTHours)

  def Tax(noOfHours: Double, noOfOTHours: Double): Double = beforeTax(noOfHours, noOfOTHours) * 12 / 100

  def takeHomeSalary(noOfHours: Double, noOfOTHours: Double): Double = beforeTax(noOfHours, noOfOTHours) - Tax(noOfHours, noOfOTHours)

}
