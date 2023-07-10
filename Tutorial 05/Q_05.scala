object Q_05 {
  def main(args: Array[String]): Unit = {
    printf("Enter a number : ")
    var num = scala.io.StdIn.readInt()

    println(sum(num))
  }

  def isEven(n: Int): Boolean = n match {
    case x if (x == 0) => true
    case x if (x == 1) => false
    case _ => isEven(n - 2)
  }

    def sum(n: Int): Int = n match {
      case x if (n==0) => 0
      case x if isEven(x) => n + sum(n-2)
      case _ => sum(n-1)
    }
}
