object Q_02 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val input = scala.io.StdIn.readInt()
    println(Answer(input))
  }


  val Answer = (input: Int) => MatchNum(input)


  def MatchNum(input: Int): String = input match {
    case x if x < 0 => "Negative"
    case x if x == 0 => "Zero"
    case x if x % 2 == 0 => "Even"
    case _ => "Odd"
  }

}
