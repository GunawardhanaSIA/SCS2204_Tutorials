object Q_06 {
  def main(args: Array[String]): Unit = {
    printf("Enter a number in Fibonacci Sequence : ")
    var num = scala.io.StdIn.readInt()

    fibSeq(num)
  }

  def fib(n: Int): Int = n match {
    case 0 => 0
    case x if x==1 => 1
    case _ => fib(n-1) + fib(n-2)
  }

  def fibSeq(n: Int): Unit = {
    if(n>0) {
      fibSeq(n-1)
      println (fib(n))
    }
  }

}
