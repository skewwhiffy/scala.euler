package euler

import org.scalatest.FunSuite

class Euler003Test extends FunSuite {
  /*
    The prime factors of 13195 are 5, 7, 13 and 29.

    What is the largest prime factor of the number 600851475143 ?
   */
  val sut = new Euler003

  test("sample data") {
    assertResult(List(5, 7, 13, 29)) {
      sut.primeFactors(13195)
    }
  }
}
