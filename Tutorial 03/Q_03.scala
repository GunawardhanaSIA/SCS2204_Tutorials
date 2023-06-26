object Q_03 {
  def main(args: Array[String]): Unit = {
    printf("Enter the num1 = ")
    var num1 = scala.io.StdIn.readDouble()

    printf("Enter the num2 = ")
    var num2 = scala.io.StdIn.readDouble()

    printf("Average = %.2f", average(num1, num2))
  }

  def average(num1: Double, num2: Double): Double = {
    (num1 + num2) / 2
  }

}
