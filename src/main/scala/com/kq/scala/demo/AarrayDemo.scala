package com.kq.scala.demo

object AarrayDemo {


  /**
    * 打印
    * @param args
    */
  def printArgs(args: Array[String]): Unit = {
    args.foreach(println)
  }


  /**
    * 相当于join 比如a,b,c
    * @param args
    * @return
    */
  def join(args: Array[String]) = args.mkString("-")

  def main(args: Array[String]): Unit = {

    val greetStrings = new Array[String](3)
    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "world!\n"
    for (i <- 0 to 2)
      print(greetStrings(i))


    printArgs(greetStrings)

    val oneTwoThree = 1 :: 2 :: 3 :: Nil
    println(oneTwoThree)

    var list1 = List("a", "b") ::: List("c", "d")
    println(list1)

    print(join(greetStrings))

  }

}
