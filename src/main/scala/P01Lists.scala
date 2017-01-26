package ninetynine

/* This file contains solutions for List related Scala 99 problems */


 /**	
  * P01 (*) Find the last element of a list
  * Example:
  * scala> last(List(1, 1, 2, 3, 5, 8)
  * res0: Int = 8
  **/
object PO1 {
   def main(args: Array[String]): Unit = {
     val xs = List(1,2,3,4,5)
     println(lastRecursive(xs))
 }
  
  // Using builtin function
  def lastBuiltin[A](list: List[A]): A = list.last
  
  // Using length function  
  def lastLength[A](list: List[A]): A = list(list.length - 1)
  
  // Using recursive and pat match
  def lastRecursive[A](list: List[A]): A = list match {
    case h :: Nil => h
    case _ :: tai => lastRecursive(tai)
    case _ => throw new NoSuchElementException  
  }
  

}

/**
 * P02 (*) Find the last but one element of a list.
 * Example:
 * scala> penultimate(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 5
 */
object P02 {
  
  def penultimateBuiltin[T](list: List[T]): T = list.init.last
  
  def penultimateRecursive[T](list: List[T]): T = list match {
    case h :: _ :: Nil => h
    case _ :: tail     => penultimateRecursive(tail)
    case _             => throw new NoSuchElementException
  }
  
}