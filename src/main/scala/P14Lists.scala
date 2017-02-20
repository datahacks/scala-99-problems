
/**
 * P14 (*) Duplicate the elements of a list.
 * Example:
 * scala> duplicate(List('a, 'b, 'c, 'c, 'd))
 * res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
 */

object P14Lists {
  
  def main(args: Array[String]): Unit = {
    val ls = List('a, 'b, 'c, 'c, 'd)
    println(duplicate(ls))
  }
  
  def duplicate(list: List[Symbol]) = list flatMap { x => List(x,x) }
  
}