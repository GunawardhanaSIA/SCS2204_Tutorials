object Q_01 {
  def main(args: Array[String]): Unit = {
    printf("Enter a number : ")
    var num = scala.io.StdIn.readInt()

    println(isprime(num))
  }

  def GCD(a: Int, b: Int): Int = b match {
    case 0 => a
    case x if x > a => GCD(x, a)
    case _ => GCD(b, a%b)
  }

  def isprime(n: Int, i: Int = 2): Boolean = i match {
    case x if (n == i) => true
    case x if GCD(n, x) > 1 => false
    case _ => isprime(n, i + 1)
  }
}



