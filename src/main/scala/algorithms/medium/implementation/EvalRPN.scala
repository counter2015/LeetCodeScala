package algorithms.medium.implementation

object EvalRPN {

  /** RunTime Info:
    * 484 ms, 52.7 MB
    *
    * @param tokens the tokens of RPN sequence
    * @return the result
    */
  def evalRPN(tokens: Array[String]): Int = {
    import scala.collection.mutable
    val s = mutable.Stack[Int]()
    for (token <- tokens) {
      token match {
        case "+" =>
          val b = s.pop()
          val a = s.pop()
          s.push(a + b)
        case "-" =>
          val b = s.pop()
          val a = s.pop()
          s.push(a - b)
        case "*" =>
          val b = s.pop()
          val a = s.pop()
          s.push(a * b)
        case "/" =>
          val b = s.pop()
          val a = s.pop()
          s.push(a / b)
        case i: String => s.push(i.toInt)
      }

    }
    s.pop()
  }
}