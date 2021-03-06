
/**
 * P04 (*) Find the number of elements of a list.
 * Example:
 * scala> length(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 6
 */

object P04Lists {
  
  def main(args: Array[String]): Unit = {
      val xs = List(1,2,3,4,5,6,7,8,9,10)
      val ys = List(1, 1, 2, 3, 5, 8)
      println(lengthTailRecursive(xs))
      println(lengthBuiltin(ys))
  }
  
  def lengthTailRecursive[T](list: List[T]) = {
    def accum[T](n: Int, xs: List[T]): Int = (n,xs) match {
      case (n,Nil) => n
      case (n,_ :: tail) => accum(n+1, tail)
    }
    accum(0, list)
  }
  
  def lengthBuiltin[T](list: List[T]) = list.length
   
}