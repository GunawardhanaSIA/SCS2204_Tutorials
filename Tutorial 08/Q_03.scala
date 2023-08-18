object Q_03 {
  def main(args: Array[String]): Unit = {
    var n1 = scala.io.StdIn.readLine("1st name : ")
    var n2 = scala.io.StdIn.readLine("2nd name : ")
    var n3 = scala.io.StdIn.readLine("3rd name : ")
    var n4 = scala.io.StdIn.readLine("4th name : ")

    println(formatNames(toUpper, n1))
    println(formatNames((nameOfThePerson: String) => toUpper(nameOfThePerson.substring(0, 2)) + nameOfThePerson.substring(2), n2))
    println(formatNames(toLower, n3))
    println(formatNames((nameOfThePerson: String) => toUpper(nameOfThePerson.substring(0, 1)) + nameOfThePerson.substring(1, nameOfThePerson.length - 1) + toUpper(nameOfThePerson.substring(nameOfThePerson.length - 1)), n4))
  }

  def toUpper(n: String): String = {
    n.toUpperCase()
  }

  def toLower(n: String): String = {
    n.toLowerCase()
  }

  def formatNames(fn: String => String, name: String): String = {
    fn(name)
  }

}
