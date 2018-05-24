import org.scalatest.{MustMatchers, WordSpec}

class P08Spec extends WordSpec with MustMatchers {

  "eliminator" must {

    "return a List when given a List" in {

      P08.eliminator(List('a', 'b', 'c', 'a', 'd', 'e')) mustEqual List('a', 'b', 'c', 'a', 'd', 'e')
    }

    "return a shortened List when given a List" in {

      P08.eliminator(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')) mustEqual List('a', 'b', 'c', 'a', 'd', 'e')
    }
  }

}