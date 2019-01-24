package demo

/**
  * FunctionDemo
  *
  * @author kq
  * @date 2019-01-24
  */
object FunctionDemo {


  /**
    * 比较大小
    * @param x
    * @param y
    * @return
    */
  def max(x: Int, y: Int) = if (x > y) x else y

  def greet() = println("Hello, world!")

  def main(args: Array[String]): Unit = {
      println(max(10,20))
      greet()
  }


}
