object Q_04 {
  def main(args: Array[String]): Unit = {
    var max_profit = 0
    var current_profit = 0
    var ticket_price = 0
    var max_profit_ticket_price = 0

    for(ticket_price <- 1 to 100){
      current_profit = profit(ticket_price)

      if(current_profit > max_profit){
        max_profit = current_profit
        max_profit_ticket_price = ticket_price
      }
    }
    println(s"Best Ticket Price = $max_profit_ticket_price")
  }

  val normal_count = 120

  def profit(ticket_price: Int): Int = income(ticket_price) - cost(ticket_price)

  def income(ticket_price: Int): Int = ticket_price * people_count(ticket_price)


  def people_count(ticket_price: Int): Int =
    if(ticket_price < 15){
      normal_count + (15 - ticket_price)/5*20
    }
    else if(ticket_price == 15){
      normal_count
    }
    else{
      normal_count - (ticket_price - 15)/5*20
    }

  def cost(ticket_price: Int): Int = 500 + (3 * people_count(ticket_price))
}
