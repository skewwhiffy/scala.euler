package euler

import scala.annotation.tailrec

class Euler003 {
  def primeFactors(n: Long): List[Long] = primeFactors(n, 2, List()).reverse

  @tailrec
  private def primeFactors(remainder: Long, highestSoFar: Long, factorsSoFar: List[Long]): List[Long] = {
    if (remainder == 1) factorsSoFar
    else if (remainder % highestSoFar == 0) primeFactors(remainder/highestSoFar, highestSoFar, highestSoFar :: factorsSoFar)
    else primeFactors(remainder, highestSoFar + 1, factorsSoFar)
  }
}
