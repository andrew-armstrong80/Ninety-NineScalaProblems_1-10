object P07 {

  def flattener(input : List[Any]) : List[Any] =

input flatMap{

  case x: List[Any] => flattener(x)
  case y => List(y)
}

}
