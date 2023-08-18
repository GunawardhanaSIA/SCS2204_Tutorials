object Q_02 {
  def main(args: Array[String]): Unit = {

    val numbers = calculateSquare(Array(1, 2, 3, 4, 5));
    println(numbers.mkString(", "));
  }

  def calculateSquare(arr: Array[Int]): Array[Int] = {
    arr.map(arr => arr * arr);
  }

}
