object Q_02 {
  def main(args: Array[String]): Unit = {
    var str = scala.io.StdIn.readLine("Enter the string : ")
    checkStr(str.split(" "))
  }

  def checkStr(str: Array[String]): Unit = {
    if (str.length > 0) {
      if (str(0).length > 5) {
        print(str(0) + " ")
      }
      checkStr(str.slice(1, str.length))
    }
  }

}
