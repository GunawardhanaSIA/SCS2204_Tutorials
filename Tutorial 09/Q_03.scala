object Q_03 {
  def main(args: Array[String]): Unit = {

    class Account(id: String, n: Int, b: Double) {
      var NIC = id

      var accNumber = n

      var balance = b

      def transfer(acc2: Account, amount: Double) = {
        this.balance = this.balance - amount
        acc2.balance = acc2.balance + amount
      }
    }


    val a1 = new Account("001", 1, 500)
    val a2 = new Account("002", 1, 100)

    a1.transfer(a2, 50)

    println(s"Account 1 new balance = ${a1.balance}")
    println(s"Account 2 new balance = ${a2.balance}")
  }

}
