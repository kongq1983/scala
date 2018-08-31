package com.kq.scala.demo

object ListDemo {

  def main(args: Array[String]): Unit = {

      var list = List(8,2,3,4,5,6,10)

      //打印每个元素
      list.foreach(n=> print(" n="+n))
      //删除最左边2个元素
      var drop2 = list.drop(3)
      println("\ndrop2="+drop2)

      println("\n--------------------------")
      //删除最右边2个元素
      var dropRight2 = list.dropRight(2);
      println("dropRight2="+dropRight2)

      println("\n--------------------------")

      //list元素全部相加
      println("sum="+list.sum)

      //打印第2个元素
      println("list[2]="+list(2))

      var count = list.count(n=>n%2==0)
      println("count="+count)


      //注意需要 以Nil结尾
      var list2 = 1::"one"::"two"::"three"::Nil

      printf("list2=%s\n",list2)

      //判断是否存在
      var existsTwo = list2.exists(s=>s.equals("two"))
      printf("existsTwo=%s\n",existsTwo)

      //list和list2合并
      var list3 = list:::list2

      println("list3="+list3)

      var joinStr = list.mkString("-")
      println("joinStr="+joinStr)

      //取第1个元素
      var head = list.head
      printf("head=%s\n",head)

      //去除第一个
      var tail = list.tail
      printf("tail=%s\n",tail)

      //取最后1个元素
      var last = list.last
      printf("last=%s\n",last)

      //降序排序
      var sortList = list.sortWith((x,y)=>x>=y)
      printf("sortList="+sortList)

      var mapList = list.map(s=> s+"*")
      printf("mapList=%s\n",mapList)
      //容器全部大于0
      var forAll0 = list.forall(n=> n>0);
      printf("forall0=%s\n",forAll0)
      //容器全部大于5
      var forAll5 = list.forall(n=> n>5);
      printf("forall5=%s\n",forAll5)
      //反转
      printf("reverse list = %s \n",list.reverse)

      //_例子
      list.foreach(printf(" %s",_));

  }

}
