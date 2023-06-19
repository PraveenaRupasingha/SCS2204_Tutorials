object Q4 {
    def main(args: Array[String]): Unit = {

      var maxProfit = 0
      var bestPrice = 0

      for(ticketPrice <- 1 to 1000){
        var currentProfit = profit(ticketPrice)

        if(currentProfit >= maxProfit){
          maxProfit = currentProfit
          bestPrice = ticketPrice
        }
      }
      println(s"The best ticket price is $bestPrice")
    }

    def profit(ticketPrice: Int): Int = income(ticketPrice) - cost(ticketPrice)

    def income(ticketPrice: Int): Int = ticketPrice * peopleCount(ticketPrice)

    def peopleCount(ticketPrice: Int): Int = {

      if(ticketPrice < 15){
        120 + (15 - ticketPrice)/ 5 * 20
      }
      else if (ticketPrice > 15) {
        120 - (ticketPrice - 15) / 5 * 20
      }
      else{
        120
      }
    }

    def cost(ticketPrice: Int): Int = 500 + 3 * peopleCount(ticketPrice)
}
