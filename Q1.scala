object Q_01 {
  def main(args:Array[String]): Unit = {
    var k,i,j = 2
    var m, n = 5
    var f = 12.0f
    var g = 4.0f
    var c = 'X'

    println(s"k+12*m = ${k+12*m}")
    println(s"m/j = ${m/j}")
    println(s"n%j = ${n%j}")
    println(s"m/j*j = ${m/j*j}")
    println(s"f+10*5+g = ${f+10*5+g}")
    //println(s"++i*n = ${++1*n}")   Pre-increment is not supported in scala
    println(s"++i*n = ${increment(i)*n}")
  }

  def increment(z: Int): Int = z + 1
}
