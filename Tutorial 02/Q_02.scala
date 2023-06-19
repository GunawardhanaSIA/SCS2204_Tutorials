object Q_02 {
  def main(args: Array[String]): Unit = {
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    var g = 4.0f
    var k = 4.3f

    //println(--b*a+c*d--)    Post and pre decrement are not supported in scala
    //println(a++)            Post increment is not supported in scala
    println(-2*(g-k)+c)
    //println(c++)            Post increment is not supported in scala
    //println(++c*a++)        Post and pre increment are not supported in scala
  }

}
