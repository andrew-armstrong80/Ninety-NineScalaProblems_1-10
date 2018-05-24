import org.scalatest.{MustMatchers, WordSpec}

class P02Spec extends WordSpec with MustMatchers {

  "penultimate" must {

    "return an Int when given a List[Int]" in {
      P02.penultimate(List(1, 1, 2, 3, 5, 8)) mustEqual 5
    }
  }

}
