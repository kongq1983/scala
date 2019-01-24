package com.kq.scala.demo


/**
  * tuples can
    contain different types of elements. Whereas a list might be a List[Int] or aList[String], a tuple could
    contain both an integer and a string at the same time.
  */
object TupleDemo {

  def main(args: Array[String]): Unit = {
      var pair = (88,"king")
      printf("[1]=%s\n",pair._1)
      printf("[2]=%s\n",pair._2)


    var pair1 = (88,"king","three",100)
    printf("[1]=%s\n",pair1._1)
    printf("[2]=%s\n",pair1._2)


  }

}
