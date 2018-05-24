import org.scalatest.{MustMatchers, WordSpec}

class P06Spec extends WordSpec with MustMatchers {

  "palindromeChecker" must {

    "return a Boolean when given a List[Int]" in {

      P06.palindromeChecker(List(1, 2, 3, 2, 1))
    }
  }

}
