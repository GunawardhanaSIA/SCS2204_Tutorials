object Q_01 {
  def main(args: Array[String]): Unit = {
    var str = scala.io.StdIn.readLine("Enter the string : ")
    println(s"Reversed string : ${reverse(str)}")
  }

  def reverse(str: String):String = {
    if(str.isEmpty()) {
      str
    }
    else {
      reverse(str.substring(1)) + str.charAt(0)
    }
  }
}
