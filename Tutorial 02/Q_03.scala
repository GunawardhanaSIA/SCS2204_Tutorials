object Q_03 {
  def main(args: Array[String]): Unit = {
    println(s"The take home salary = ${takeHomeSalary(40, 30)}")
  }

  def normal(c: Double): Double = c*250

  def OT(d: Double): Double = d*85

  def fullsalary(e: Double, f: Double): Double = e+f

  def tax(g: Double): Double = g*0.12

  def takeHomeSalary(normalHours: Double, OTHours: Double): Double = {
    var finalSalary: Double = fullsalary(normal(normalHours), OT(OTHours))
    finalSalary - tax(finalSalary)
  }
}
