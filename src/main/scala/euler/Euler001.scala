package euler

class Euler001 {
  def sumUpTo(upperLimit: Long): Long = {
    (0L to upperLimit - 1)
      .filter(it => it % 3 == 0 || it % 5 == 0)
      .foldLeft(0L)(_ + _)
  }
}
