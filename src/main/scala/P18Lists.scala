
/**
 * P18 (**) Extract a slice from a list.
 * Given two indices, I and K, the slice is the list containing the elements from and including the Ith 
 * element up to but not including the Kth element of the original list. Start counting the elements with 0.
 * Example:
 * 
 * scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
 * res0: List[Symbol] = List('d, 'e, 'f, 'g)
 */

object P18Lists {
  
  def main(args: Array[String]) = {
    val ls = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    println(slice(3, 7, ls))
  }
  
  // slice using recursive and zipWithIndex
  def slice(i: Int, k: Int, list: List[Symbol] ) = {
    
    def accum(result: List[Symbol], xs: List[(Symbol, Int)] ): List[Symbol] = xs match {
      case Nil => result.reverse  
      case h:: tail if (h._2 >= i && h._2 < k ) => accum(h._1:: result, tail)
      case h:: tail => accum(result, tail)
    }
    
    accum(List(), list.zipWithIndex)
    
  }
}