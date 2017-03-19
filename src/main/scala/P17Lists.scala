
/**
 * P17 (*) Split a list into two parts.
 * The length of the first part is given. Use a Tuple for your result.
 * Example:
 * 
 * scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
 * res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
 * 
 */


object P17Lists {
  
  def main(args: Array[String]): Unit = {
    val ls = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    println(splitBuiltIn(3,ls))
    
    println(splitRecursive(3,ls))
  }
  
  // using builtin splitAt
  def splitBuiltIn(n: Int, list: List[Symbol]) = list.splitAt(n)
  
  // try recursive option instead of using splitAt
  def splitRecursive(n: Int, list: List[Symbol]) = {
    
    def accum(result1: List[Symbol], 
        result2: List[Symbol], 
        i: Int, xs: List[Symbol]): (List[Symbol], List[Symbol]) = xs match {
      case h:: tail if (i == 0) => (result1.reverse, h:: tail ::: result2)
      case h:: tail => accum(h:: result1, result2, i-1, tail) 
    }
    accum(List(), List(), n, list)
  }
}
