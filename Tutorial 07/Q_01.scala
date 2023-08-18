object Q_01 {
  def main(args: Array[String]): Unit = {

    val numbers = filterEvenNumbers(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    println(numbers.mkString(", "));
  }

  def filterEvenNumbers(arr: Array[Int]): Array[Int] = {
    arr.filter(arr => arr % 2 == 0);
  }

}
