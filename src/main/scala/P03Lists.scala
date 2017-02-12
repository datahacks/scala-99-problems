
/**
 * P03 (*) Find the Kth element of a list.
 * By convention, the first element in the list is element 0
 * Example:
 * scala> nth(2, List(1, 1, 2, 3, 5, 8))
 * res0: Int = 2 */

object P03Lists {
  
  def main(args: Array[String]): Unit = {
    val xs = List("zeroth","first","second","third")
    println(nthRecursive(2,xs))
    println(nthBuiltin(3,xs))
  }
  
  def nthRecursive[T](n: Int, list: List[T]): T = (n, list) match {
    case (0, h:: _) => h
    case (n, _:: tail) => nthRecursive(n-1, tail)
    case (_, Nil) => throw new NoSuchElementException
  }
  
  def nthBuiltin[T](n: Int, list: List[T]): T = list(n)
}