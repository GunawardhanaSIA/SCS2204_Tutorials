object Q_02 {
  def main(args: Array[String]): Unit = {
    printf("Enter the number of strings = ")
    var n = scala.io.StdIn.readInt()

    var a = 0

    for(a <- 1 to n) {
      var str = scala.io.StdIn.readLine("Enter the string : ")
      check_str(str)
    }
  }

  def check_str(str: String): Unit = {
    if (str.length() > 5) {
      println(str)
    }
  }

}
