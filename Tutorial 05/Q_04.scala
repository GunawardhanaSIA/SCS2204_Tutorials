object Q_04 {
  def main(args: Array[String]): Unit = {
    printf("Enter a number : ")
    var num = scala.io.StdIn.readInt()

    if(func(num)) {
      println("Even")
    }
    else {
      println("Odd")
    }
  }

  def func(n: Int): Boolean = n match {
    case x if (x==0) => true
    case x if (x==1) => false
    case _ => func(n-2)
  }

}
