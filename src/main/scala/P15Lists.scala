
/**
 * P15 (**) Duplicate the elements of a list a given number of times.
 * Example:
 * scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
 * res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
 */

object P15Lists {
  
  def main(args: Array[String]): Unit = {
    val ls = List('a, 'b, 'c, 'c, 'd)
    println(duplicateN(3, ls))
  }
  
  def duplicateN(n: Int, list: List[Symbol] ) = {
    
    def accum(i: Int, sym: Symbol, result: List[Symbol]): List[Symbol] = i match {
      case i if i == 0 => result
      case i  => accum(i - 1, sym, sym:: result) 
    }
    
    list.flatMap { x => accum(n,x, List()) }
    
  }
  
}