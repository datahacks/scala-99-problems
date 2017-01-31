
/**
 * P07 (**) Flatten a nested list structure.
 * Example:
 * scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
 * res0: List[Any] = List(1, 1, 2, 3, 5, 8)
 */

object P07 {
  def main(args: Array[String]) = {
    val xs = List(List(1, 1), 2, List(3, List(5, 8)))
    println(flatten(xs))
  }
  
  def flatten[T](list: List[T]): List[T] = list match {
    case Nil => Nil
    case (h: List[T]) :: tail => flatten(h) ++ flatten(tail)
    case h:: tail => h :: flatten(tail)
  }
}