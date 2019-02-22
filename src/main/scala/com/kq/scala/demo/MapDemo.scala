package demo



/**
  * MapDemo
  *
  * @author kq
  * @date 2019-01-24
  */
object MapDemo {

  def main(args: Array[String]): Unit = {
    val treasureMap = scala.collection.mutable.Map[Int, String]()
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "Find big X on ground.")
    treasureMap += (3 -> "Dig.")
    println(treasureMap)
    println(treasureMap(2))


    //scala.collection.immutable.Map
    var romanNumeral = Map(
      1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
    )
    println(romanNumeral(4))


    romanNumeral += (6-> "VI");

    println(romanNumeral)

  }

}
