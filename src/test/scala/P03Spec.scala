import org.scalatest.{MustMatchers, WordSpec}

class P03Spec extends WordSpec with MustMatchers {

  "kthElement" must {

    "return an Int when given an Int and a List[Int]" in {

      P03.kthElement(2, List(1, 1, 2, 3, 5, 8)) mustEqual 2
    }
  }

}
