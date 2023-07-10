object Q_01 {
  def main(args: Array[String]): Unit = {
    printf("Enter a number : ")
    var num = scala.io.StdIn.readInt()

    if (isprime(num, 2)) {
      println("Yes")
    }
    else {
      println("No")
    }
  }

  def isprime(n: Int, i: Int): Boolean = i match {
    case x if (n < i) => false
    case x if (n == i) => true
    case x if (n % i == 0) => false
    case x if (i * i > n) => true
    case _ => isprime(n, i + 1)
  }
}


