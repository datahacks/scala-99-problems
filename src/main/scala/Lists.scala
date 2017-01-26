

/* This file contains solutions for List related Scala 99 problems */


 /**	
  * P01 (*) Find the last element of a list
  * Example:
  * scala> last(List(1, 1, 2, 3, 5, 8)
  * res0: Int = 8
  **/
object PO1 {
  // Using builtin function
  def lastBuiltin[A](list: List[A]): A = list.last
  
  // Using length function  
  def lastLength[A](list: List[A]): A = list(list.length - 1)
  
  // Using recursive and pat match
  def lastRecursive[A](list: List[A]): A = list match {
    case h :: Nil => h
    case _ :: tail => lastRecursive(tail)
    case _ => throw new NoSuchElementException  
  }
  
}

/**
 * P02 (*) Find the last but one element of a list.
 * Example:
 * scala> penultimate(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 5
 */