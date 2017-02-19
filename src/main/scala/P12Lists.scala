
/**
 * P12 (**) Decode a run-length encoded list.
 * Given a run-length code list generated as specified in problem P10, construct its 
 * uncompressed version.
 * Example:
 * 
 * scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
 * res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
 */

object P12Lists {
  
  def main(args: Array[String]): Unit = {
    val ls = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    println(decode(ls))
  }
  
  def decode(list: List[(Int,Symbol)]): List[Symbol] = {
    
   def extend(xs: (Int,Symbol), result: List[Symbol] ): List[Symbol] = xs match {
     case (n,s) if n == 0 => result 
     case (n,s) => extend((n-1, s), s :: result)
   }
    list.flatMap{x => extend(x,List()) }
  }
  
}