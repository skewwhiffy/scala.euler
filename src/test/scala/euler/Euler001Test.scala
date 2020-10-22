package euler

import org.scalatest.FunSuite

class Euler001Test extends FunSuite {
  /*
  If we list all the natural numbers below 10 that are multiples of
  3 or
    5, we get 3
  , 5
  , 6 and 9. The sum of these multiples is
  23.

  Find the sum of all the multiples of 3 or 5 below 1000.
   */

  val sut: Euler001 = new Euler001

  test("sample works") {
    val expected = 23

    val result = sut.sumUpTo(10)

    assert(result == expected)
  }
}
