import org.scalatest.{MustMatchers, WordSpec}

class P05Spec extends WordSpec with MustMatchers {

  "reverser" must {

    "return a reversed list when given a list" in {

      P05.reverser(List(1, 1, 2, 3, 5, 8)) mustEqual List(8, 5, 3, 2, 1, 1)
    }
  }

}
