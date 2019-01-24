package demo

import scala.collection.mutable

import scala.collection.immutable.HashSet

/**
  * SetDemo
  *
  * @author kq
  * @date 2019-01-24
  */
object SetDemo {

  def main(args: Array[String]): Unit = {
    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    println(jetSet.contains("Cessna"))


    //set
    val movieSet = mutable.Set("Hitch", "Poltergeist")
    movieSet += "Shrek"
    println(movieSet)

    //hashset
    val hashSet = HashSet("Tomatoes", "Chilies")
    println(hashSet + "Coriander")


  }

}
