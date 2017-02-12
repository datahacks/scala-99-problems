
/**
 * P05 (*) Reverse a list.
 * Example:
 * scala> reverse(List(1, 1, 2, 3, 5, 8))
 * res0: List[Int] = List(8, 5, 3, 2, 1, 1)
 */

object P05Lists {
  
  def main(args: Array[String]): Unit = {
    val xs = List("abc", "def", "ghi")
    xs.foreach(println)
    println("====reverse====")
    reverseTailRecursive(xs).foreach(println)
  }
  
  def reverseTailRecursive[T](list: List[T]) = {
    def accum[T](result:List[T], xs: List[T]) : List[T] =  xs match  {
      case Nil => result
      case h :: tail => accum(h :: result, tail)
   
    }
    accum(List[T](), list)
  }
}