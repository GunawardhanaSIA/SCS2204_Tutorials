object Q_03 {
  def main(args: Array[String]): Unit = {
    printf("Enter the num1 = ")
    var num1 = scala.io.StdIn.readInt()

    printf("Enter the num2 = ")
    var num2 = scala.io.StdIn.readInt()

    var num3 = num2.toDouble

    printf("Average = %.2f", average(num1, num3))
  }

  def average(num1: Int, num3: Double): Double = {
    (num1 + num3) / 2
  }

}
