package demo

import scala.io.Source

/**
  * FileDemo
  *
  * @author kq
  * @date 2019-01-24
  */
object FileDemo {

  def main(args: Array[String]): Unit = {

    def filename = "D:\\tmp\\text.txt";
    for (line <- Source.fromFile(filename,"gb2312").getLines())
      println(line.length + " " + line)


    val lines = Source.fromFile(filename,"gb2312").getLines().toList

    println("-------------------------------------------------------")
    println(lines)

    val longestLine = lines.reduceLeft(
      (a, b) => if (a.length > b.length) a else b
    )
    println("-------------------------------------------------------")
    println(longestLine)

  }

}
