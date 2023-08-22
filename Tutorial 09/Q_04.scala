object Q_04 {
  def main(args: Array[String]): Unit = {

    class Account(id: String, n: Int, b: Double) {
      var NIC = id

      var accNumber = n

      var balance = b

      override def toString: String =
        NIC + " : " + accNumber + " : " + balance
    }


    val a1: Account = new Account("001", 1, 4000)
    val a2: Account = new Account("002", 2, 5000)
    val a3: Account = new Account("003", 3, -2000)
    val a4: Account = new Account("004", 4, -500)

    var bank: List[Account] = List(a1, a2, a3, a4)

    def accountsWithNegativeBalances(): List[Account] =
      bank.filter(x => x.balance < 0)


    def sumOfAllAccounts(): Double =
      bank.map(x => x.balance).reduce((x, y) => x + y)


    def interest(x: Account): Unit = {
      if (x.balance > 0) {
        x.balance *= 1.05
      } else if (x.balance < 0) {
        x.balance *= 1.1
      }
    }


    println("\nAccounts with negative balances: ")
    accountsWithNegativeBalances().foreach(x => println(x))


    println("\nSum of all account balances: " + sumOfAllAccounts())


    println("\nFinal balances of all accounts: ")
    bank.foreach(x => (interest(x), println(x)))

  }

}
