/**
 * P02 (*) Find the last but one element of a list.
 * Example:
 * scala> penultimate(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 5
 */
object P02 {

  def main(args: Array[String]): Unit = {
    val xs = List(1,2,3,4,22,5)
    println("penultimate Builtin: " +penultimateBuiltin(xs))
    println("penultimate Recursive: " +penultimateRecursive(xs))
    println("penultimate Length: " +penultimateLength(xs))
    println("Last 5th Element using builtin: " +lastNthBuilitin(5,xs))
    
  }
  
  def penultimateBuiltin[T](list: List[T]): T = list.init.last
  
  def penultimateRecursive[T](list: List[T]): T = list match {
    case h :: _ :: Nil => h
    case _ :: tail     => penultimateRecursive(tail)
    case _             => throw new NoSuchElementException
  }
  
  def penultimateLength[T](list: List[T]): T = 
    list(list.length - 2)
 
  def lastNthBuilitin[T](n: Int,list: List[T]): T = {
    list.takeRight(n).head
  }
}