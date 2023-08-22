object Q_01 {
  def main(args: Array[String]): Unit = {

    class Rational(x:Int, y:Int) {
      def numer = x
      def denom = y

      def neg = new Rational(-this.numer, this.denom)

      override def toString = numer + "/" + denom
    }


    val a = new Rational(5, 6)
    println(a.neg)
  }

}
