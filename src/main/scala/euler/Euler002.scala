package euler

class Euler002 {
  def generateHead(numberOfTerms: Int): List[Int] = {
    (1 to numberOfTerms)
      .foldLeft(List[Int]()) ((c, _) => generateNext(c))
      .reverse
  }

  private def generateNext(soFar: List[Int]): List[Int] = {
    soFar.length match {
      case 0 => List(1)
      case 1 => 2 :: soFar
      case _ => soFar.take(2).sum :: soFar
    }
  }
}
