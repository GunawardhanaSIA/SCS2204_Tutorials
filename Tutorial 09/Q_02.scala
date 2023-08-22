object Q_02 {
  def main(args: Array[String]): Unit = {

    class Rational(x: Int, y: Int) {
      def numer = x
      def denom = y

      def sub(r: Rational) = new Rational(numer * r.denom - r.numer * denom, denom * r.denom)

      override def toString = numer + "/" + denom
    }


    val a = new Rational(3, 4)
    val b = new Rational(5, 8)
    val c = new Rational(2, 7)
    println(a.sub(b).sub(c))
  }

}
