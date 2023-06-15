object tutorial_01 {
  def main(args: Array[String]): Unit = {
    println(s"Area of the disk = ${area(5)}")
    println(s"Temperature = ${temp(35)}")
    println(s"Volume of the sphere = ${volume(5)}")
    println(s"Total wholesale cost = ${cost(60)}")
    println(s"The total running time = ${time(4,3)}")
  }

  def area(r: Double): Double = math.Pi * r * r

  def temp(c: Double): Double = (c * 1.8) + 32.0

  def volume(r: Double): Double = (4.0/3) * math.Pi * (r * r * r)

  def coverprice(noofbooks: Int): Double = noofbooks * 24.95
  def discount(noofbooks: Int): Double = noofbooks * 0.4 * 24.95
  def shipping(noofbooks: Int): Double = if(noofbooks <= 50) 3.0 else (3.0+(noofbooks-50)*0.75)
  def cost(books: Int): Double = coverprice(books) - discount(books) + shipping(books)

  def easy(distance: Double): Double = 8.0 * distance
  def tempo(distance: Double): Double = 7.0 * distance
  def time(easytime: Double, tempotime: Double): Double = easy(easytime) + tempo(tempotime)
}
