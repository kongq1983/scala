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


    //$name
    val name = "reader"
    println(s"Hello, $name!")

    val answer = s"The answer is ${6 * 7}."
    println(answer)

    //3.14159
    val pi = f"${math.Pi}%.5f"
    println(pi)

    val pi1 = f"$pi is approximately ${math.Pi}%.8f.";
    println(pi1)


    val s = "Hello, world!"

    var pos = s indexOf 'o'
    println(pos)

    var pos1 = s indexOf ('o', 5)
    println(pos1)

    //lower
    println(s.toLowerCase)
    //upper
    println(s toUpperCase)



  }

}
