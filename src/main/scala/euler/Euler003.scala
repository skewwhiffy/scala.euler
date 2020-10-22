package euler

import scala.annotation.tailrec

class Euler003 {
  def primeFactors(n: Int): List[Int] = primeFactors(n, 2, List()).reverse

  @tailrec
  private def primeFactors(remainder: Int, highestSoFar: Int, factorsSoFar: List[Int]): List[Int] = {
    remainder match {
      case 1 => factorsSoFar
      case _ =>
        val newHighestSoFar = (highestSoFar to remainder)
          .filter(it => remainder % it == 0)
          .head
        val newFactorsSoFar = newHighestSoFar :: factorsSoFar
        primeFactors(remainder / newHighestSoFar, newHighestSoFar, newFactorsSoFar)
    }
  }
}
