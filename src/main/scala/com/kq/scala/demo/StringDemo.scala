package demo

/**
  * StringDemo
  *
  * @author kq
  * @date 2019-01-24
  */
object StringDemo {

  def main(args: Array[String]): Unit = {
      var str = "welcome to scala!"
      println(str)
      var arg = Array("Scala","Kafka","Spark");
      arg.foreach(a=> println(a))

      arg.foreach(println)

      for(s <- arg) {
        println(s)
      }

  }

}
