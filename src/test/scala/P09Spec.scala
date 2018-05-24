import org.scalatest.{MustMatchers, WordSpec}

class P09Spec extends WordSpec with MustMatchers {

  "sublister" must {

    "return List[List[Char]] when given List[Char]" in {

      P09.sublister(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')) mustEqual List(List('a', 'a', 'a', 'a'), List('b'), List('c', 'c'), List('a', 'a'), List('d'), List('e', 'e', 'e', 'e'))
    }
  }

}
