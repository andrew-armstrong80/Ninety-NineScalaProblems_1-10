object P09 {

  def sublister(input : List[Char]) : List[List[Char]] = {

    if (input.isEmpty) List(List())
     else {
      val (packed, next) = input span { _ == input.head }
      if (next == Nil) List(packed)
      else packed :: sublister(next)
    }
  }

}
