package Problems

/**
  * Created by parshah on 19-Jul-16.
  */

import scala.io._
object Main {
  def main(args: Array[String]): Unit ={



    val inp : List [Int]  = StdIn.readLine.split(" ").map(_.toInt).toList
    val N = inp(0)
    val Q = inp(1)
    val inp2 = StdIn.readLine.split(" ").map(_.toInt).toList
    val array :Array[Int] = inp2.toArray
    var t  = new  Array[Int](105)
    for (i <- 1 to Q){
      t(i) = StdIn.readInt()
    }
    val min = array.min
    val max = array.max
    for(i <- 1 to Q){
      if (t(i) >= min && t(i) <= max){
        println("Yes")
      }
      else{
        println("No")
      }
    }


  }

}
