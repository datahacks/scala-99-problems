
/**
 * P08 (**) Eliminate consecutive duplicates of list elements.
 * If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
 * Example:
 * scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
 * res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
 *  
 */

object P08 {
  
  def main(args: Array[String]) = {
    val ts = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(compressTailRecursive(ts))
  }
  
  def compressTailRecursive[T](list: List[T]) = {
    def accum[T](result: List[T], xs: List[T]): List[T] = xs match {
      case h :: tail => accum(h :: result, tail.dropWhile(_ == h))
      case Nil => result.reverse
    }
    accum(Nil,list)
  }
  
  
}