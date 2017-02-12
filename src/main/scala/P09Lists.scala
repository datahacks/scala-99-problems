
/**
 * P09 (**) Pack consecutive duplicates of list elements into sublists.
 * If a list contains repeated elements they should be placed in separate sublists.
 * Example:
 * 
 * scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
 * res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
 *  
 */

object P09Lists {
  
  def main(args: Array[String]) = {
    val ls = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val ns = List()
    println(pack(ls))
    // TODO Not handling empty list input
    //println(pack(ns))
  }
  
  def pack(list: List[Symbol]): List[List[Symbol]] = {
    
    def accum(result: List[List[Symbol]], prev: Symbol, xs: List[Symbol]): List[List[Symbol]] = xs match {
      case Nil => result.reverse
      case h:: tail if h == prev => accum((h :: result.head) :: result.tail, h, tail)
      case h:: tail => accum(List(h) :: result, h, tail)
    }
    accum(List(List(list.head)), list.head, list.tail)
    
  }

  
  
}