package com.kq.scala.demo

/**
  * Created by qikong on 2019/2/22.
  */
object ForeachDemo {

 def main(args: Array[String]): Unit = {
     var list = List(1,2,3,4,5);

     list.foreach(println)

     list.foreach(n => println(n))

      for(n <- list)
          println(n)


      for(n <- 0 to 5)
          println(n)


      var list2 = list.map(n=> "hello"+n);

      list2.foreach(println)

 }


}
