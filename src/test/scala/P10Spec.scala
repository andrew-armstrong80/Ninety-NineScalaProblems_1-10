import org.scalatest.{MustMatchers, WordSpec}

class P10Spec extends WordSpec with MustMatchers {

  "runLengthEncoder" must {

    "return List[Int, Char] when given List[Char]" in {

      P10.runLengthEncoder(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')) mustEqual List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))
    }
  }
}
