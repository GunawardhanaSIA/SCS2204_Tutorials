object Q_03 {
  def main(args: Array[String]): Unit = {
    printf("Enter a number : ")
    var num = scala.io.StdIn.readInt()

    println(sum(num))
  }

  def sum(n: Int): Int = n match {
    case 0 => 0
    case _ => n + sum(n-1)
  }

}
