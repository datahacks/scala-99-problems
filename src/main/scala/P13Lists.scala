
/**
 * P13 (**) Run-length encoding of a list (direct solution).
 * Implement the so-called run-length encoding data compression method directly. 
 * I.e. don't use other methods you've written (like P09's pack); do all the work directly.
 * Example:
 * 
 * scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
 * res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
 */

object P13Lists {
  
  def main(args: Array[String]): Unit = {
    val ls = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(encodeDirect(ls))
  }
  
  def encodeDirect(list: List[Symbol]): List[(Int, Symbol)] = {
    
    def accum(result: List[(Int,Symbol)], prev: Symbol, xs: List[Symbol], n: Int ): 
    List[(Int, Symbol)] = xs match {
      
      case Nil => result.reverse
      case h:: tail if h == prev => accum((n+1,h) :: result.tail, h, tail, n+1  )
      case h:: tail => accum((1,h):: result,h,tail, 1)
      
    }
    accum(List((1, list.head)), list.head, list.tail, 1)
  }
  
}