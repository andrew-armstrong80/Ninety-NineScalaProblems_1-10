object P08 {

  def eliminator(input : List[Char]) : List[Char] = {

    input match {
      case Nil => Nil
      case head :: tail => head :: eliminator(tail.dropWhile(_ == head))
    }
  }

}
