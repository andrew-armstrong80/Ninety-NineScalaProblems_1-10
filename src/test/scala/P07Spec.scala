import org.scalatest.{MustMatchers, WordSpec}

class P07Spec extends WordSpec with MustMatchers {

  "flattener" must {

    "return a list when given a list of lists" in {

      P07.flattener(List(List(1, 1), List(5, 8)))
    }

    "return a list when given a nested list" in {

      P07.flattener(List(List(1, 1), 2, List(3, List(5, 8)))) mustEqual List(1, 1, 2, 3, 5, 8)
    }
  }

}
