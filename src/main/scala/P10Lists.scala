
/**
 * P10 (*) Run-length encoding of a list.
 * Use the result of problem P09 to implement the so-called run-length encoding data compression method. 
 * Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of 
 * duplicates of the element E.
 * Example:
 * 
 * scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
 * res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
 */

object P10Lists {
  def main(args: Array[String]) = {
    val ls = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(encode(ls))
  }
  
  def encode(list: List[Symbol]):List[(Int,Symbol)] = {
    var xs = List[(Int,Symbol)]()
    P09Lists.pack(list).foreach { l => xs = (l.length,l.head) :: xs }
    return xs.reverse
  }
  
}