import Q_01.calculateAverage

object Q_02 {
  def main(args: Array[String]): Unit = {

    val input = List("apple", "banana", "cherry", "date")

    println(s"Total count of letter occurrences: ${countLetterOccurrences(input)}")
  }


  def countLetterOccurrences(words: List[String]): Int = {
    val wordLengths = words.map(x => x.length)

    wordLengths.reduce((x, y) => x+y)
  }

}
