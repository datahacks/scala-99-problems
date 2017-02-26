
/**
 * P16 (**) Drop every Nth element from a list.
 * Example:
 * scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
 * res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
 */

object P16Lists {
  
  def main(args: Array[String]): Unit = {
    val ls = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    println(drop(3, ls))
  }
  
  def drop(n: Int, list: List[Symbol]) = {
    
    def accum(result: List[Symbol], xs: List[(Symbol, Int)], i: Int): List[Symbol] = xs match {
      case h:: tail if (h._2 + 1) % i == 0 => accum(result, tail, i)
      case h:: tail  => accum(h._1:: result, tail, i)
      case Nil => result.reverse
    }
   
   accum(List(), list.zipWithIndex, n)
    
  }
}

// used zipWithIndex, tuple2, pattern matching