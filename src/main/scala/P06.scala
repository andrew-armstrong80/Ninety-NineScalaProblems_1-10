object P06 {

  def palindromeChecker(input : List[Int]) : Boolean = {
    if (input.reverse == input) {
      true
    } else {
      false
    }
  }
}
