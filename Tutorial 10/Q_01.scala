object Q_01 {
  def main(args: Array[String]): Unit = {

    val celsiusList = List(0.0, 10.0, 20.0, 30.0)

    println(s"Average Fahrenheit temperature : ${calculateAverage(celsiusList)}")

  }

  def calculateAverage(celsius: List[Double]): Double = {
    val fahrenheitList = celsius.map(x => (x * 9 / 5) + 32)

    val sum = fahrenheitList.reduce((x, y) => x+y)

    sum / fahrenheitList.length.toDouble
  }

}
