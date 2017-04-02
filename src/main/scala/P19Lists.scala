
/**
 * P19 (**) Rotate a list N places to the left.
 * Examples:
 * scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
 * res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
 * 
 * scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
 * res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
 */



object P19Lists {
  
  def main(args: Array[String]): Unit = {
    val ls = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    println(rotate(3,ls))
    println(rotate(-2,ls))
    println(rotate(0,ls))
  }
  
  // using P17 split and built-in reverse
  def rotate(i: Int, list: List[Symbol]) = {
      
      def reverseFlat(xs: (List[Symbol],List[Symbol])) = xs._2 ::: xs._1
      
      if (i == 0) list
      else if (i > 0) reverseFlat(P17Lists.splitRecursive(i, list))
      else reverseFlat(P17Lists.splitRecursive(-i,list.reverse)).reverse
  }
  
}