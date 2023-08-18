object Q_03 {
  def main(args: Array[String]): Unit = {
    val numbers = filterPrime(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    println(numbers.mkString(", "));
  }


    def filterPrime(arr: Array[Int]): Array[Int] = {
      arr.filter(arr => prime(arr));
    }

    def gcd(a: Int, b: Int): Int = a match {
      case a if (a == 0) => b
      case _ => gcd(b % a, a)
    }

    def prime(p: Int, n: Int = 2): Boolean = n match {
      case x if (p == 1) => false
      case x if (p == x) => true
      case x if gcd(p, x) > 1 => false
      case x => prime(p, x + 1)
    }

}
