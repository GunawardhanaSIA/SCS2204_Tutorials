object Q_02 {
  def main(args: Array[String]): Unit = {
    printf("Enter an integer number = ")
    var num = scala.io.StdIn.readInt()

    println(check_num(num))
  }

  def check_num(num: Int): String = num match {
    case x if x <= 0 => "Negative/Zero"
    case x if x%2 == 0 => "Even number is given"
    case x if x%2 == 1 => "Odd number is given"
    }

}
