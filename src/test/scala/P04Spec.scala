import org.scalatest.{MustMatchers, WordSpec}

class P04Spec extends WordSpec with MustMatchers {

  "listLength" must {

    "return an Int when given a List[Int]" in {

      P04.listLength(List(1, 1, 2, 3, 5, 8)) mustEqual 6
    }
  }

}
