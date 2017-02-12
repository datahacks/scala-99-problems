
/**
 * P06 (*) Find out whether a list is a palindrome.
 * Example:
 * scala> isPalindrome(List(1, 2, 3, 2, 1))
 * res0: Boolean = true
 */

object P06Lists {
  
  def main(args: Array[String]): Unit = {
    val xs = List(1,2,3,2,1)
    val ys = List(1,2,3,1,1)
    println(isPalindrome(xs))
    println(isPalindrome(ys))
  }
  
  def isPalindrome[T](list: List[T]): Boolean =
    list == list.reverse
}