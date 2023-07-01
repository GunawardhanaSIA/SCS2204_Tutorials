object Q_01 {
  def main(args: Array[String]): Unit = {
    printf("Enter the deposit amount = ")
    var dep_amount = scala.io.StdIn.readDouble()

    println(s"The amount of interest that Rs.$dep_amount earns in a year = ${interest(dep_amount)}")
  }

  def interest(dep_amount: Double): Double = dep_amount match {
    case x if x <= 20000 => dep_amount*0.02
    case x if x <= 200000 => dep_amount*0.04
    case x if x <= 2000000 => dep_amount*0.035
    case _ => dep_amount*0.065
  }

}
