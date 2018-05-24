import org.scalatest.{MustMatchers, WordSpec}

class P01Spec extends WordSpec with MustMatchers {

  "lastElement" must {

    "return Int when given a List[Int]" in {
      P01.lastElement(List(1, 1, 2, 3, 5, 8)) mustEqual 8
    }
  }

}
