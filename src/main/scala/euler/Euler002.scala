package euler

import java.util.function.Predicate

class Euler002 {
  def fibs(current: Int = 0, next: Int = 1): LazyList[Int] = LazyList.cons(current, fibs(next, current + next))
}
